package br.com.pid.smartbilling.control;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;

import br.com.pid.smartbilling.model.FolhaDeLeitura;
import br.com.pid.smartbilling.repository.FolhaLeituraDaoRepository;

@Named
@ViewScoped
public class FolhaLeituraControl {

	private FolhaDeLeitura leitura =  new FolhaDeLeitura();

	private FolhaDeLeitura leituraSelecionada;

	private Integer uc;

	private List<FolhaDeLeitura> leituras = new ArrayList<>();

	@Autowired
	private FolhaLeituraDaoRepository leituraRepository;
	

	@PostConstruct
	public void init() {
		listar();
	}

	public void listar(){
		leituras =  leituraRepository.findAll();
		//new PageRequest(0, 50)
	}

	public void buscarPorUc(){
		if (uc != null) {
			FolhaDeLeitura leitura = leituraRepository.findByUc(uc);
			leituras.add(leitura);
		}
	}

	public FolhaDeLeitura getLeitura() {
		return leitura;
	}

	public void setLeitura(FolhaDeLeitura leitura) {
		this.leitura = leitura;
	}

	public FolhaDeLeitura getLeituraSelecionada() {
		return leituraSelecionada;
	}

	public void setLeituraSelecionada(FolhaDeLeitura leituraSelecionada) {
		this.leituraSelecionada = leituraSelecionada;
	}

	public Integer getUc() {
		return uc;
	}

	public void setUc(Integer uc) {
		this.uc = uc;
	}

	public List<FolhaDeLeitura> getLeituras() {
		return leituras;
	}

	public void setLeituras(List<FolhaDeLeitura> leituras) {
		this.leituras = leituras;
	}

}
