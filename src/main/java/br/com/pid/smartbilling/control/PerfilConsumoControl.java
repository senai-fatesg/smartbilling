package br.com.pid.smartbilling.control;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.pid.smartbilling.model.PerfilConsumo;
import br.com.pid.smartbilling.repository.PerfilConsumoDaoRespository;

@Named
@ViewScoped
public class PerfilConsumoControl {

	private PerfilConsumo leitura =  new PerfilConsumo();

	private PerfilConsumo leituraSelecionada;

	private Integer id;

	private List<PerfilConsumo> leituras = new ArrayList<>();

	@Autowired
	private PerfilConsumoDaoRespository perfilConsumoDao;


	@PostConstruct
	public void init() {
		//listar();
	}

	public void buscarPorUc(){
		PerfilConsumo leitura = perfilConsumoDao.findByUc(id);
		if (leitura != null) {
			leituras.add(leitura);
		}else {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "Não existe registro com este número de uc."));
		}
	}


	public PerfilConsumo getLeitura() {
		return leitura;
	}

	public void setLeitura(PerfilConsumo leitura) {
		this.leitura = leitura;
	}

	public PerfilConsumo getLeituraSelecionada() {
		return leituraSelecionada;
	}

	public void setLeituraSelecionada(PerfilConsumo leituraSelecionada) {
		this.leituraSelecionada = leituraSelecionada;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<PerfilConsumo> getLeituras() {
		return leituras;
	}
	

}
