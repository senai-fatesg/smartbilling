package br.com.pid.smartbilling.control;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.pid.smartbilling.model.Sql;
import br.com.pid.smartbilling.repository.SqlDaoRepository;

@Named
@ViewScoped
public class SqlControl {

	private Sql sql = new Sql();

	private Sql sqlExcluir;

	private List<Sql> sqls = new ArrayList<>();

	@Autowired
	private SqlDaoRepository sqlDao;

	@PostConstruct
	public void init(){
		listar();
	}

	public void confirmar(){
		if (this.sql != null) {
			sqlDao.save(this.sql);
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, sql.getDescricao(), " salvo com sucesso.");
			FacesContext.getCurrentInstance().addMessage(sql.getDescricao(), message);
			limparCampos();
			this.sqls = sqlDao.findAll();
		}else {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, null, "Erro ao salvar o sql."));
		}
	}

	public void listar(){
		try {
			sqls = sqlDao.findAll();
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), "Erro ao listar."));
		}
	}

	public void editar(Sql sql){
		this.sql = sqlDao.findOne(sql.getId());
		setSql(this.sql);
	}

	public void excluir(Sql sql){
		if(sql != null){
			sqlDao.delete(sql);
			this.sqls = sqlDao.findAll();
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Sql", " excluído com sucesso.");
			FacesContext.getCurrentInstance().addMessage(sql.getDescricao(), message);
		}else {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, null, "Erro ao excluir o sql."));
		}
	}

	public void limparCampos(){
		this.sql = new Sql();
	}

	public Sql getSql() {
		return sql;
	}

	public Sql getSqlExcluir() {
		return sqlExcluir;
	}

	public void setSqlExcluir(Sql sqlExcluir) {
		this.sqlExcluir = sqlExcluir;
	}

	public void setSql(Sql sql) {
		this.sql = sql;
	}

	public void setSqls(List<Sql> sqls) {
		this.sqls = sqls;
	}

	public List<Sql> getSqls() {
		return sqls;
	}

}
