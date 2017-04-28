package br.com.pid.smartbilling.control;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.hibernate.loader.custom.Return;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.TransferEvent;
import org.primefaces.event.UnselectEvent;
import org.primefaces.model.DualListModel;
import org.primefaces.model.UploadedFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.context.Theme;

import br.com.pid.smartbilling.model.PerfilConsumo;
import br.com.pid.smartbilling.model.Sql;
import br.com.pid.smartbilling.repository.PerfilConsumoDaoRespository;
import br.com.pid.smartbilling.repository.SqlDaoRepository;

@Named
@ViewScoped
public class MigradorControl {

	private DualListModel<String> dados = new DualListModel<>();

	private UploadedFile file;

	private String sql;

	private boolean migrarCsv;

	private PerfilConsumo perfilConsumo = new PerfilConsumo();

	private List<String> dadosSource = new ArrayList<String>();

	private List<String> dadosTarget = new ArrayList<String>();

	private List<Sql> sqls = new ArrayList<>();

	@Autowired
	private PerfilConsumoDaoRespository perfilConsumoDao;

	@Autowired
	private SqlDaoRepository sqlDao;


	@PostConstruct
	public void init(){
		listarSqls();
	}

	public void getUpload() {
		if(file != null && file.getFileName().endsWith("csv")) {
			File newFile = convert(file);
			lerArquivo(newFile);
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

		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String linha = "";
			int coluna = 0; 
			while (coluna < 1 && br.ready()) {
				coluna ++;
				linha += br.readLine();
				linha = linha.trim();
				String [] array = linha.split(";");
				for (int i = 0; i < array.length; i++) {
					dadosSource.add(array[i]);
				}
				dados = new DualListModel<String>(dadosSource, dadosTarget);
				while (br.ready()) {
					String linha2 = br.readLine();
					String [] array2 = linha2.split(";");

					perfilConsumo.setMedidor(array2[0]);                      
					perfilConsumo.setMesano(array2[1]);                       
					perfilConsumo.setLeitura(array2[2]);                      
					perfilConsumo.setTipo_leitura(array2[3]);                 
					perfilConsumo.setKwh(array2[4]);                          
					perfilConsumo.setFuncao(array2[5]);                       
					perfilConsumo.setFm(array2[6]);                           
					perfilConsumo.setDias_fat(Integer.parseInt(array2[7]));                     
					perfilConsumo.setDt_leitura(array2[8]);                   
					perfilConsumo.setR$(array2[9]);                           
					perfilConsumo.setOrigem(array2[10]);                       
					perfilConsumo.setDt_apresentacao(array2[11]);            
					perfilConsumo.setConsumidor(array2[12]);                   
					perfilConsumo.setDivisa(array2[13]);                       
					perfilConsumo.setId(Integer.parseInt(array2[14]));                           
					perfilConsumo.setInput_type_id(Integer.parseInt(array2[15]));                
					perfilConsumo.setClassification(array2[16]);               
					perfilConsumo.setDescription(array2[17]);                  
					perfilConsumo.setPrevious_reading(array2[18]);             
					perfilConsumo.setCurrent_reading(array2[19]);              
					perfilConsumo.setDifference_reading(array2[20]);           
					perfilConsumo.setMultiplication_factor(array2[21]);        
					perfilConsumo.setAmount(array2[22]);                       
					perfilConsumo.setFk_invvw_id(Integer.parseInt(array2[23]));                  
					perfilConsumo.setDivisa_1(array2[24]);                     
					perfilConsumo.setId_1(Integer.parseInt(array2[25]));                         
					perfilConsumo.setFk_invce_id(Long.parseLong(array2[26]));                  
					perfilConsumo.setFk_invvw_id_1(array2[27]);                
					perfilConsumo.setComp_code(Integer.parseInt(array2[28]));                    
					perfilConsumo.setComp_corporate_name(array2[29]);          
					perfilConsumo.setComp_name(array2[30]);                    
					perfilConsumo.setCusco_nrc(Integer.parseInt(array2[31]));                    
					perfilConsumo.setCust_name(array2[32]);                    
					perfilConsumo.setCust_person_type(array2[33]);             
					perfilConsumo.setDoctp_name_main(array2[34]);              
					perfilConsumo.setDocid_document_number_main(Long.parseLong(array2[35]));   
					perfilConsumo.setDoctp_name_aux(array2[36]);               
					perfilConsumo.setDocid_document_number_aux(Integer.parseInt(array2[37]));    
					perfilConsumo.setDue_string(array2[38]);                     
					perfilConsumo.setCompetency_year(Integer.parseInt(array2[39]));              
					perfilConsumo.setCompetency_month(Integer.parseInt(array2[40]));             
					perfilConsumo.setCharge(array2[41]);                       
					perfilConsumo.setPresentation_string(array2[42]);            
					perfilConsumo.setBar_code(array2[43]);                     
					perfilConsumo.setNumeric_bar_code(array2[44]);             
					perfilConsumo.setType_desc(array2[45]);                    
					perfilConsumo.setType(Integer.parseInt(array2[46]));                         
					perfilConsumo.setExternal_identification(array2[47]);      
					perfilConsumo.setGroup_code_invoice(array2[48]);           
					perfilConsumo.setIdentification(Long.parseLong(array2[49]));               
					perfilConsumo.setCntuc_identifier(Long.parseLong(array2[50]));             
					perfilConsumo.setIndication_address(array2[51]);           
					perfilConsumo.setGroup_code(Integer.parseInt(array2[52]));                   
					perfilConsumo.setAccnt_identification(Integer.parseInt(array2[53]));         
					perfilConsumo.setRoute_code(Integer.parseInt(array2[54]));                   
					perfilConsumo.setScript_number(Integer.parseInt(array2[55]));                
					perfilConsumo.setPrevious_reading_string(array2[56]);        
					perfilConsumo.setCurrent_reading_string(array2[57]);         
					perfilConsumo.setCntrv_description_link(array2[58]);       
					perfilConsumo.setInvpm_bank_ext_identificatioN(array2[59]);
					perfilConsumo.setInvpm_agency(array2[60]);                 
					perfilConsumo.setInvpm_bank_account(array2[61]);           
					perfilConsumo.setCntrv_code_activity(array2[62]);          
					perfilConsumo.setCntrv_description_activity(array2[63]);   
					perfilConsumo.setInstalled_meter(array2[64]);              
					perfilConsumo.setNext_reading_string(array2[65]);            
					perfilConsumo.setLoss_tax(array2[66]);                     
					perfilConsumo.setSupply_days(Integer.parseInt(array2[67]));                  
					perfilConsumo.setDaily_consumption_average(array2[68]);    
					perfilConsumo.setMonthly_consumption_average(array2[69]);  
					perfilConsumo.setHash_code(array2[70]);                    
					perfilConsumo.setLocal(array2[71]);                        
					perfilConsumo.setInvci_dic_goal(array2[72]);               
					perfilConsumo.setInvci_fic_goal(array2[73]);               
					perfilConsumo.setInvci_dmic_goal(array2[74]);              
					perfilConsumo.setInvci_dic_index(array2[75]);              
					perfilConsumo.setInvci_dmic_index(array2[76]);             
					perfilConsumo.setInvci_continuity_set(array2[77]);         
					perfilConsumo.setInvci_dec_goal(array2[78]);               
					perfilConsumo.setInvci_fec_goal(array2[79]);               
					perfilConsumo.setInvci_fec_index(array2[80]);              
					perfilConsumo.setInvci_dec_index(array2[81]);              
					perfilConsumo.setInvoice_quantity(array2[82]);             
					perfilConsumo.setModality(array2[83]);                     
					perfilConsumo.setSupplyvoltage(Integer.parseInt(array2[84]));                
					perfilConsumo.setMeasurementvoltage(array2[85]);           
					perfilConsumo.setRegional(array2[86]);                     
					perfilConsumo.setTotal_parcel(array2[87]);                 
					perfilConsumo.setParcel_number(array2[88]);                
					perfilConsumo.setPay_mode(Integer.parseInt(array2[89]));                     
					perfilConsumo.setFk_addvw_id_col(Integer.parseInt(array2[90]));              
					perfilConsumo.setFk_addvw_id_ins(Integer.parseInt(array2[91]));              
					perfilConsumo.setFk_grinv_id(Integer.parseInt(array2[92]));                  
					perfilConsumo.setExternal_sequential(Integer.parseInt(array2[93]));          
					perfilConsumo.setGeneration_string(array2[94]);              
					perfilConsumo.setEmission_string(array2[95]);                
					perfilConsumo.setBordero_identification(array2[96]);       
					perfilConsumo.setWeather_period(array2[97]);               
					perfilConsumo.setTransformation_const(array2[98]);         
					perfilConsumo.setInstalled_meter_reactive(array2[99]);     
					perfilConsumo.setInstalled_meter_electronic(array2[100]);   
					perfilConsumo.setUse_parcel(array2[101]);                   
					perfilConsumo.setSupply_parcel(array2[102]);                
					perfilConsumo.setTariff_structure(array2[103]);             
					perfilConsumo.setYearly_consumption_average(array2[104]);   
					perfilConsumo.setGroup_voltage(array2[105]);                
					perfilConsumo.setFiscal_number_serial(Integer.parseInt(array2[106]));         
					perfilConsumo.setFiscal_number_sequential(Integer.parseInt(array2[107]));     
					perfilConsumo.setAdadd_formatted_address(array2[108]);      
					perfilConsumo.setConference(Integer.parseInt(array2[109]));                   
					perfilConsumo.setTotal_consumption(array2[110]);            
					perfilConsumo.setClass_code(Integer.parseInt(array2[111]));                   
					perfilConsumo.setClass_description(array2[112]);            
					perfilConsumo.setSub_class_code(Integer.parseInt(array2[113]));               
					perfilConsumo.setSub_class_description(array2[114]);        
					perfilConsumo.setSub_class_detailing_code(array2[115]);     
					perfilConsumo.setSub_class_detailing_desc(array2[116]);     
					perfilConsumo.setCntuc_formatted_address(array2[117]);      
					perfilConsumo.setSub_group_code(array2[118]);               
					perfilConsumo.setSub_group_description(array2[119]);        
					perfilConsumo.setWeather_period_code(Integer.parseInt(array2[120]));          
					perfilConsumo.setMeasurement_modality_desc(array2[121]);    
					perfilConsumo.setFk_cntrv_id_measurement_mod(Integer.parseInt(array2[122]));  
					perfilConsumo.setFk_iwust_id_base(Integer.parseInt(array2[123]));             
					perfilConsumo.setFk_iwust_id_agency_polar(Integer.parseInt(array2[124]));     
					perfilConsumo.setIndication_agency_attendance(array2[125]); 
					perfilConsumo.setBase_due_string(array2[126]);                
					perfilConsumo.setInvci_fic_index(Integer.parseInt(array2[127]));              
					perfilConsumo.setInvoicing_condition(array2[128]);          
					perfilConsumo.setFk_iwrcr_id(array2[129]);                  
					perfilConsumo.setLow_income(array2[130]);                   
					perfilConsumo.setInvci_dic_trimestral_goal(array2[131]);    
					perfilConsumo.setInvci_dic_annual_goal(array2[132]);        
					perfilConsumo.setInvci_fic_trimestral_goal(array2[133]);    
					perfilConsumo.setInvci_fic_annual_goal(array2[134]);        
					perfilConsumo.setInvci_dic_trimestral_index(array2[135]);   
					perfilConsumo.setInvci_dic_annual_index(array2[136]);       
					perfilConsumo.setInvci_fic_trimestral_index(array2[137]);   
					perfilConsumo.setInvci_fic_annual_index(array2[138]);       
					perfilConsumo.setAverage_cost_monthly(array2[139]);         
					perfilConsumo.setAverage_cost_trimestral(array2[140]);      
					perfilConsumo.setAverage_cost_annual(array2[141]);          
					perfilConsumo.setRef_month_index(Integer.parseInt(array2[142]));              
					perfilConsumo.setRef_year_index(Integer.parseInt(array2[143]));               
					perfilConsumo.setValue_tust(array2[144]);                   
					perfilConsumo.setSector_fee(array2[145]);                   
					perfilConsumo.setFiscal_number_ref_month(Integer.parseInt(array2[146]));      
					perfilConsumo.setFiscal_number_ref_year(Integer.parseInt(array2[147]));       
					perfilConsumo.setGenerated_by_printcenter(Integer.parseInt(array2[148]));     
					perfilConsumo.setResend_invoice(Integer.parseInt(array2[149]));               
					perfilConsumo.setFile_name(array2[150]);                    
					perfilConsumo.setInvci_dicri_goal(array2[151]);             
					perfilConsumo.setInvci_dicri_index(array2[152]);            
					perfilConsumo.setPfc_start_string(array2[153]);               
					perfilConsumo.setBraille_invoice(Integer.parseInt(array2[154]));              
					perfilConsumo.setIndication_federal_governmenT(array2[155]);
					perfilConsumo.setFk_iwrgd_id(array2[156]);                  
					perfilConsumo.setTotal_gross_value_cofins(Integer.parseInt(array2[157]));     
					perfilConsumo.setTotal_gross_value_pis(Integer.parseInt(array2[158]));        
					perfilConsumo.setTotal_gross_value_irrf(Integer.parseInt(array2[159]));       
					perfilConsumo.setTotal_gross_valUE_CSLL(Integer.parseInt(array2[160]));  

					if(!validarDadoMigrado(perfilConsumo.getId(), perfilConsumo.getDt_leitura())){
						perfilConsumoDao.save(perfilConsumo);
					}

				}
			}

			br.close();
			fr.close();
		}catch (Exception e) {

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

}

