package br.com.pid.smartbilling.control;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtField;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.primefaces.event.SelectEvent;
import org.primefaces.event.TransferEvent;
import org.primefaces.event.UnselectEvent;
import org.primefaces.model.DualListModel;
import org.primefaces.model.UploadedFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.ui.context.Theme;

import br.com.pid.smartbilling.daoJdbc.PerfilConsumoDaoJdbc;
import br.com.pid.smartbilling.model.PerfilConsumo;
import br.com.pid.smartbilling.model.Sql;
import br.com.pid.smartbilling.repository.PerfilConsumoDaoRespository;
import br.com.pid.smartbilling.repository.SqlDaoRepository;
import br.com.pid.smartbilling.util.Reflection;

@Named
@ViewScoped
public class MigradorControl implements Serializable{

	private static final long serialVersionUID = 1L;

	private DualListModel<String> dados = new DualListModel<>();

	private UploadedFile file;
	
	private File arquivo;

	private String sql;

	private String nomeCollection;

	private boolean migrarCsv;

	private static boolean flagSynchronized;

	private PerfilConsumo perfilConsumo = new PerfilConsumo();

	private List<String> dadosSource = new ArrayList<String>();

	private List<String> dadosTarget = new ArrayList<String>();

	private List<Sql> sqls = new ArrayList<>();

	private List<Map<String, Object>> listMap = new ArrayList<>();
	
	private Map<String, Integer> mapDados = new HashMap<>();

	private static Class newClass;

	@Autowired
	private PerfilConsumoDaoRespository perfilConsumoDao;


	@Autowired
	private MongoTemplate mongoTemplate;

	private PerfilConsumoDaoJdbc perfilConsumoDaoJdbc = new PerfilConsumoDaoJdbc();

	@Autowired
	private SqlDaoRepository sqlDao;


	@PostConstruct
	public void init(){
		listarSqls();
	}

	public void getUpload() {
		if(file != null && file.getFileName().endsWith("csv")) {
			arquivo = convert(file);
			lerArquivo(arquivo);
			FacesMessage message = new FacesMessage("Upload realizado com sucesso.", file.getFileName() + " is uploaded.");
			FacesContext.getCurrentInstance().addMessage(null, message);
		}else{
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_WARN, "ERRO: O arquivo deve ter a extensão .csv", " O arquivo deve ter a extensão .csv");
			FacesContext.getCurrentInstance().addMessage(null, message);
		}
	}

	public File convert(UploadedFile file2){    
		File convFile = new File(file2.getFileName());
		try {
			convFile.createNewFile();
			FileOutputStream fos = new FileOutputStream(convFile); 
			fos.write((file2).getContents());
			fos.close(); 
		} catch (IOException e) {
			e.getMessage();
		} 
		return convFile;
	}

	public void lerArquivo(File file){

		String [] array = {};
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String linha = "";
			int coluna = 0; 
			while (coluna < 1 && br.ready()) {
				coluna ++;
				linha += br.readLine();
				linha = linha.trim();
				array = linha.split(";");
				for (int i = 0; i < array.length; i++) {
					mapDados.put(array[i], i);
				}
				
				dadosSource = new ArrayList<>(mapDados.keySet());

				dados = new DualListModel<String>(dadosSource, dadosTarget);

			}
		}catch (Exception e) {

		}
	}
	
	public void gravarDados(){
		String [] array2 = {};
		CtClass point = null;
		try {
			while(flagSynchronized) {
				Thread.sleep(2000);
			}
			flagSynchronized = true;
			point = ClassPool.getDefault().get("br.com.pid.smartbilling.model.EntidadeGenerica");
			CtClass tipoString = ClassPool.getDefault().get("java.lang.String");
			
			point.defrost();
			
			FileReader fr = new FileReader(arquivo);
			BufferedReader br = new BufferedReader(fr);
			String linha2 = "";
			int coluna = 0; 
			br.ready();
			br.readLine();
			List<String> targets = dados.getTarget();
			for (String novaColuna : targets) {
				CtField f = new CtField(tipoString, novaColuna, point);
				point.addField(f);
			}
			
			if (newClass == null) {
				newClass = point.toClass();
			}
			if (newClass != null && !nomeCollection.isEmpty()) {
				while (br.ready()) {
					linha2 = br.readLine();
					array2 = linha2.split(";");
					
					Object objNewClass = newClass.newInstance();
					for (String colunaSelecionada : targets) {
						Reflection.set(objNewClass, colunaSelecionada, array2[mapDados.get(colunaSelecionada)]);
					}
					mongoTemplate.save(objNewClass, nomeCollection);
				}
				FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, nomeCollection, " Dados gravados com sucesso.");
				FacesContext.getCurrentInstance().addMessage(null, message);
			}else{
				FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Não foi possível gravar os dados. verifique os campos preenchidos", " verifique os campos preenchidos");
				FacesContext.getCurrentInstance().addMessage(null, message);
			}
			

		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), "Erro ao gravar os dados no mongo."));
			e.printStackTrace();
		}finally{
			point.detach();
			flagSynchronized = false;
		}
	}

	public boolean validarDadoMigrado(Integer id, String dt_leitura){
		PerfilConsumo perfilConsumo =  perfilConsumoDao.findByUcAndDataLeitura(id, dt_leitura);
		if (perfilConsumo != null){
			return true;
		}else {
			return false;
		}
	}

	public void executarSql(){
		listMap = perfilConsumoDaoJdbc.consultarPersonalizado(sql);
		Map<String, Object> mapa = listMap.get(0);
		dadosSource = new ArrayList<>(mapa.keySet());
		dados = new DualListModel<String>(dadosSource, dadosTarget);
	}

	public void gravarDadosNoMongodb(){
		CtClass point = null;
		try {
			while(flagSynchronized) {
				Thread.sleep(2000);
			}
			flagSynchronized = true;
			point = ClassPool.getDefault().get("br.com.pid.smartbilling.model.EntidadeGenerica");
			CtClass tipoString = ClassPool.getDefault().get("java.lang.String");
			CtClass tipoInteger = ClassPool.getDefault().get("java.lang.Integer");
			CtClass tipoDate = ClassPool.getDefault().get("java.util.Date");
			CtClass tipoLong = ClassPool.getDefault().get("java.lang.Long");
			CtClass tipoBigDecimal = ClassPool.getDefault().get("java.math.BigDecimal");
			CtClass tipoBoolean = ClassPool.getDefault().get("java.lang.Boolean");
			CtClass tipoDouble = ClassPool.getDefault().get("java.lang.Double");
			CtClass tipoFloat = ClassPool.getDefault().get("java.lang.Float");

			point.defrost();
			List<String> targets = dados.getTarget();

			for (String colunaSelecionada : targets) {
				if (listMap.get(0).get(colunaSelecionada) instanceof String) {
					CtField f = new CtField(tipoString, colunaSelecionada, point);
					point.addField(f);
				}
				if (listMap.get(0).get(colunaSelecionada) instanceof Integer) {
					CtField f = new CtField(tipoInteger, colunaSelecionada, point);
					point.addField(f);
				}
				if (listMap.get(0).get(colunaSelecionada) instanceof java.util.Date) {
					CtField f = new CtField(tipoDate, colunaSelecionada, point);
					point.addField(f);
				}
				if (listMap.get(0).get(colunaSelecionada) instanceof Long) {
					CtField f = new CtField(tipoLong, colunaSelecionada, point);
					point.addField(f);
				}
				if (listMap.get(0).get(colunaSelecionada) instanceof BigDecimal) {
					CtField f = new CtField(tipoBigDecimal, colunaSelecionada, point);
					point.addField(f);
				}
				if (listMap.get(0).get(colunaSelecionada) instanceof Boolean) {
					CtField f = new CtField(tipoBoolean, colunaSelecionada, point);
					point.addField(f);
				}
				if (listMap.get(0).get(colunaSelecionada) instanceof Double) {
					CtField f = new CtField(tipoDouble, colunaSelecionada, point);
					point.addField(f);
				}
				if (listMap.get(0).get(colunaSelecionada) instanceof Float) {
					CtField f = new CtField(tipoFloat, colunaSelecionada, point);
					point.addField(f);
				}
			}

			if (newClass == null) {
				newClass = point.toClass();
			}
			if (newClass != null && !nomeCollection.isEmpty()) {
				for (Map<String, Object> map : listMap) {
					Object objNewClass = newClass.newInstance();
					for (String colunaSelecionada : targets) {
						Reflection.set(objNewClass, colunaSelecionada, map.get(colunaSelecionada));
					}
					mongoTemplate.save(objNewClass, nomeCollection);
				}
				FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, nomeCollection, " Dados gravados com sucesso.");
				FacesContext.getCurrentInstance().addMessage(null, message);
			}else{
				FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Não foi possível gravar os dados. verifique os campos preenchidos", " verifique os campos preenchidos");
				FacesContext.getCurrentInstance().addMessage(null, message);
			}

		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), "Erro ao gravar os dados no mongo."));
			e.printStackTrace();
		}finally{
			point.detach();
			flagSynchronized = false;
		}
	}

	public DualListModel<String> getDados() {
		return dados;
	}

	public void setDados(DualListModel<String> dados) {
		this.dados = dados;
	}

	public void onTransfer(TransferEvent event) {
		StringBuilder builder = new StringBuilder();
		for(Object item : event.getItems()) {
			builder.append(((Theme) item).getName()).append("<br />");
		}

		FacesMessage msg = new FacesMessage();
		msg.setSeverity(FacesMessage.SEVERITY_INFO);
		msg.setSummary("Items Transferred");
		msg.setDetail(builder.toString());

		FacesContext.getCurrentInstance().addMessage(null, msg);
	} 

	public void onSelect(SelectEvent event) {
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Item Selected", event.getObject().toString()));
	}

	public void onUnselect(UnselectEvent event) {
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Item Unselected", event.getObject().toString()));
	}

	public void onReorder() {
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "List Reordered", null));
	}

	public void listarSqls(){
		this.sqls = sqlDao.findAll();
	}

	public UploadedFile getFile() {
		return file;
	}

	public void setFile(UploadedFile file) {
		this.file = file;
	}

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	public List<String> getDadosSource() {
		return dadosSource;
	}

	public void setDadosSource(List<String> dadosSource) {
		this.dadosSource = dadosSource;
	}

	public List<String> getDadosTarget() {
		return dadosTarget;
	}

	public void setDadosTarget(List<String> dadosTarget) {
		this.dadosTarget = dadosTarget;
	}

	public List<Sql> getSqls() {
		return sqls;
	}

	public boolean isMigrarCsv() {
		return migrarCsv;
	}

	public void setMigrarCsv(boolean migrarCsv) {
		this.migrarCsv = migrarCsv;
	}

	public PerfilConsumoDaoJdbc getPerfilConsumoDaoJdbc() {
		return perfilConsumoDaoJdbc;
	}

	public void setPerfilConsumoDaoJdbc(PerfilConsumoDaoJdbc perfilConsumoDaoJdbc) {
		this.perfilConsumoDaoJdbc = perfilConsumoDaoJdbc;
	}

	public PerfilConsumo getPerfilConsumo() {
		return perfilConsumo;
	}

	public void setPerfilConsumo(PerfilConsumo perfilConsumo) {
		this.perfilConsumo = perfilConsumo;
	}

	public List<Map<String, Object>> getListMap() {
		return listMap;
	}

	public String getNomeCollection() {
		return nomeCollection;
	}

	public void setNomeCollection(String nomeCollection) {
		this.nomeCollection = nomeCollection;
	}

	public Class getNewClass() {
		return newClass;
	}

	public void setNewClass(Class newClass) {
		this.newClass = newClass;
	}

	public static boolean isFlagSynchronized() {
		return flagSynchronized;
	}

	public static void setFlagSynchronized(boolean flagSynchronized) {
		MigradorControl.flagSynchronized = flagSynchronized;
	}

	public Map<String, Integer> getMapDados() {
		return mapDados;
	}

	public File getArquivo() {
		return arquivo;
	}

	public void setArquivo(File arquivo) {
		this.arquivo = arquivo;
	}
	

}

