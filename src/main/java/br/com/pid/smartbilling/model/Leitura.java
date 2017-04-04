package br.com.pid.smartbilling.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Embeddable
@Document
public class Leitura{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;
	private String CONT_LeitDoPeriodoAtual_OU_SALV_LeitDoPeriodoAnterior;
	private String zero1NumeroBlocoDeDadosMemoriaDeMassa_;
	private String reservadoParaUsoFuturo_;
	private String valorDo1oCanallVisivelEmSeu1oPeriodo;
	private String valorDo2oCanallVisivelEmSeu1oPeriodo;
	private String valorDo3oCanallVisivelEmSeu1oPeriodo;
	private String valorDo1oCanallVisivelEmSeu2oPeriodo;
	private String valorDo2oCanallVisivelEmSeu2oPeriodo;
	private String valorDo3oCanallVisivelEmSeu2oPeriodo;
	private String valorDo1oCanallVisivelEmSeu3oPeriodo;
	private String valorDo2oCanallVisivelEmSeu3oPeriodo;
	private String valorDo3oCanallVisivelEmSeu3oPeriodo;
	private String valorDo1oCanallVisivelEmSeu4oPeriodo;
	private String valorDo2oCanallVisivelEmSeu4oPeriodo;
	private String valorDo3oCanallVisivelEmSeu4oPeriodo;
	private String valorDo1oCanallVisivelEmSeu5oPeriodo;
	private String valorDo2oCanallVisivelEmSeu5oPeriodo;
	private String valorDo3oCanallVisivelEmSeu5oPeriodo;
	private String valorDo1oCanallVisivelEmSeu6oPeriodo;
	private String valorDo2oCanallVisivelEmSeu6oPeriodo;
	private String valorDo3oCanallVisivelEmSeu6oPeriodo;
	private String valorDo1oCanallVisivelEmSeu7oPeriodo;
	private String valorDo2oCanallVisivelEmSeu7oPeriodo;
	private String valorDo3oCanallVisivelEmSeu7oPeriodo;
	private String valorDo1oCanallVisivelEmSeu8oPeriodo;
	private String valorDo2oCanallVisivelEmSeu8oPeriodo;
	private String valorDo3oCanallVisivelEmSeu8oPeriodo;
	private String valorDo1oCanallVisivelEmSeu9oPeriodo;
	private String valorDo2oCanallVisivelEmSeu9oPeriodo;
	private String valorDo3oCanallVisivelEmSeu9oPeriodo;
	private String valorDo1oCanallVisivelEmSeu10oPeriodo;
	private String valorDo2oCanallVisivelEmSeu10oPeriodo;
	private String valorDo3oCanallVisivelEmSeu10oPeriodo;
	private String valorDo1oCanallVisivelEmSeu11oPeriodo;
	private String valorDo2oCanallVisivelEmSeu11oPeriodo;
	private String valorDo3oCanallVisivelEmSeu11oPeriodo;
	private String valorDo1oCanallVisivelEmSeu12oPeriodo;
	private String valorDo2oCanallVisivelEmSeu12oPeriodo;
	private String valorDo3oCanallVisivelEmSeu12oPeriodo;
	private String valorDo1oCanallVisivelEmSeu13oPeriodo;
	private String valorDo2oCanallVisivelEmSeu13oPeriodo;
	private String valorDo3oCanallVisivelEmSeu13oPeriodo;
	private String valorDo1oCanallVisivelEmSeu14oPeriodo;
	private String valorDo2oCanallVisivelEmSeu14oPeriodo;
	private String valorDo3oCanallVisivelEmSeu14oPeriodo;
	private String valorDo1oCanallVisivelEmSeu15oPeriodo;
	private String valorDo2oCanallVisivelEmSeu15oPeriodo;
	private String valorDo3oCanallVisivelEmSeu15oPeriodo;
	private String valorDo1oCanallVisivelEmSeu16oPeriodo;
	private String valorDo2oCanallVisivelEmSeu16oPeriodo;
	private String valorDo3oCanallVisivelEmSeu16oPeriodo;
	private String valorDo1oCanallVisivelEmSeu17oPeriodo;
	private String valorDo2oCanallVisivelEmSeu17oPeriodo;
	private String valorDo3oCanallVisivelEmSeu17oPeriodo;
	private String valorDo1oCanallVisivelEmSeu18oPeriodo;
	private String valorDo2oCanallVisivelEmSeu18oPeriodo;
	private String valorDo3oCanallVisivelEmSeu18oPeriodo;
	private String valorDo1oCanallVisivelEmSeu19oPeriodo;
	private String valorDo2oCanallVisivelEmSeu19oPeriodo;
	private String valorDo3oCanallVisivelEmSeu19oPeriodo;
	private String valorDo1oCanallVisivelEmSeu20oPeriodo;
	private String valorDo2oCanallVisivelEmSeu20oPeriodo;
	private String valorDo3oCanallVisivelEmSeu20oPeriodo;
	private String valorDo1oCanallVisivelEmSeu21oPeriodo;
	private String valorDo2oCanallVisivelEmSeu21oPeriodo;
	private String valorDo3oCanallVisivelEmSeu21oPeriodo;
	private String valorDo1oCanallVisivelEmSeu22oPeriodo;
	private String valorDo2oCanallVisivelEmSeu22oPeriodo;
	private String valorDo3oCanallVisivelEmSeu22oPeriodo;
	private String valorDo1oCanallVisivelEmSeu23oPeriodo;
	private String valorDo2oCanallVisivelEmSeu23oPeriodo;
	private String valorDo3oCanallVisivelEmSeu23oPeriodo;
	private String valorDo1oCanallVisivelEmSeu24oPeriodo;
	private String valorDo2oCanallVisivelEmSeu24oPeriodo;
	private String valorDo3oCanallVisivelEmSeu24oPeriodo;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCONT_LeitDoPeriodoAtual_OU_SALV_LeitDoPeriodoAnterior() {
		return CONT_LeitDoPeriodoAtual_OU_SALV_LeitDoPeriodoAnterior;
	}
	public void setCONT_LeitDoPeriodoAtual_OU_SALV_LeitDoPeriodoAnterior(
			String cONT_LeitDoPeriodoAtual_OU_SALV_LeitDoPeriodoAnterior) {
		CONT_LeitDoPeriodoAtual_OU_SALV_LeitDoPeriodoAnterior = cONT_LeitDoPeriodoAtual_OU_SALV_LeitDoPeriodoAnterior;
	}
	public String getZero1NumeroBlocoDeDadosMemoriaDeMassa_() {
		return zero1NumeroBlocoDeDadosMemoriaDeMassa_;
	}
	public void setZero1NumeroBlocoDeDadosMemoriaDeMassa_(String zero1NumeroBlocoDeDadosMemoriaDeMassa_) {
		this.zero1NumeroBlocoDeDadosMemoriaDeMassa_ = zero1NumeroBlocoDeDadosMemoriaDeMassa_;
	}
	public String getReservadoParaUsoFuturo_() {
		return reservadoParaUsoFuturo_;
	}
	public void setReservadoParaUsoFuturo_(String reservadoParaUsoFuturo_) {
		this.reservadoParaUsoFuturo_ = reservadoParaUsoFuturo_;
	}
	public String getValorDo1oCanallVisivelEmSeu1oPeriodo() {
		return valorDo1oCanallVisivelEmSeu1oPeriodo;
	}
	public void setValorDo1oCanallVisivelEmSeu1oPeriodo(String valorDo1oCanallVisivelEmSeu1oPeriodo) {
		this.valorDo1oCanallVisivelEmSeu1oPeriodo = valorDo1oCanallVisivelEmSeu1oPeriodo;
	}
	public String getValorDo2oCanallVisivelEmSeu1oPeriodo() {
		return valorDo2oCanallVisivelEmSeu1oPeriodo;
	}
	public void setValorDo2oCanallVisivelEmSeu1oPeriodo(String valorDo2oCanallVisivelEmSeu1oPeriodo) {
		this.valorDo2oCanallVisivelEmSeu1oPeriodo = valorDo2oCanallVisivelEmSeu1oPeriodo;
	}
	public String getValorDo3oCanallVisivelEmSeu1oPeriodo() {
		return valorDo3oCanallVisivelEmSeu1oPeriodo;
	}
	public void setValorDo3oCanallVisivelEmSeu1oPeriodo(String valorDo3oCanallVisivelEmSeu1oPeriodo) {
		this.valorDo3oCanallVisivelEmSeu1oPeriodo = valorDo3oCanallVisivelEmSeu1oPeriodo;
	}
	public String getValorDo1oCanallVisivelEmSeu2oPeriodo() {
		return valorDo1oCanallVisivelEmSeu2oPeriodo;
	}
	public void setValorDo1oCanallVisivelEmSeu2oPeriodo(String valorDo1oCanallVisivelEmSeu2oPeriodo) {
		this.valorDo1oCanallVisivelEmSeu2oPeriodo = valorDo1oCanallVisivelEmSeu2oPeriodo;
	}
	public String getValorDo2oCanallVisivelEmSeu2oPeriodo() {
		return valorDo2oCanallVisivelEmSeu2oPeriodo;
	}
	public void setValorDo2oCanallVisivelEmSeu2oPeriodo(String valorDo2oCanallVisivelEmSeu2oPeriodo) {
		this.valorDo2oCanallVisivelEmSeu2oPeriodo = valorDo2oCanallVisivelEmSeu2oPeriodo;
	}
	public String getValorDo3oCanallVisivelEmSeu2oPeriodo() {
		return valorDo3oCanallVisivelEmSeu2oPeriodo;
	}
	public void setValorDo3oCanallVisivelEmSeu2oPeriodo(String valorDo3oCanallVisivelEmSeu2oPeriodo) {
		this.valorDo3oCanallVisivelEmSeu2oPeriodo = valorDo3oCanallVisivelEmSeu2oPeriodo;
	}
	public String getValorDo1oCanallVisivelEmSeu3oPeriodo() {
		return valorDo1oCanallVisivelEmSeu3oPeriodo;
	}
	public void setValorDo1oCanallVisivelEmSeu3oPeriodo(String valorDo1oCanallVisivelEmSeu3oPeriodo) {
		this.valorDo1oCanallVisivelEmSeu3oPeriodo = valorDo1oCanallVisivelEmSeu3oPeriodo;
	}
	public String getValorDo2oCanallVisivelEmSeu3oPeriodo() {
		return valorDo2oCanallVisivelEmSeu3oPeriodo;
	}
	public void setValorDo2oCanallVisivelEmSeu3oPeriodo(String valorDo2oCanallVisivelEmSeu3oPeriodo) {
		this.valorDo2oCanallVisivelEmSeu3oPeriodo = valorDo2oCanallVisivelEmSeu3oPeriodo;
	}
	public String getValorDo3oCanallVisivelEmSeu3oPeriodo() {
		return valorDo3oCanallVisivelEmSeu3oPeriodo;
	}
	public void setValorDo3oCanallVisivelEmSeu3oPeriodo(String valorDo3oCanallVisivelEmSeu3oPeriodo) {
		this.valorDo3oCanallVisivelEmSeu3oPeriodo = valorDo3oCanallVisivelEmSeu3oPeriodo;
	}
	public String getValorDo1oCanallVisivelEmSeu4oPeriodo() {
		return valorDo1oCanallVisivelEmSeu4oPeriodo;
	}
	public void setValorDo1oCanallVisivelEmSeu4oPeriodo(String valorDo1oCanallVisivelEmSeu4oPeriodo) {
		this.valorDo1oCanallVisivelEmSeu4oPeriodo = valorDo1oCanallVisivelEmSeu4oPeriodo;
	}
	public String getValorDo2oCanallVisivelEmSeu4oPeriodo() {
		return valorDo2oCanallVisivelEmSeu4oPeriodo;
	}
	public void setValorDo2oCanallVisivelEmSeu4oPeriodo(String valorDo2oCanallVisivelEmSeu4oPeriodo) {
		this.valorDo2oCanallVisivelEmSeu4oPeriodo = valorDo2oCanallVisivelEmSeu4oPeriodo;
	}
	public String getValorDo3oCanallVisivelEmSeu4oPeriodo() {
		return valorDo3oCanallVisivelEmSeu4oPeriodo;
	}
	public void setValorDo3oCanallVisivelEmSeu4oPeriodo(String valorDo3oCanallVisivelEmSeu4oPeriodo) {
		this.valorDo3oCanallVisivelEmSeu4oPeriodo = valorDo3oCanallVisivelEmSeu4oPeriodo;
	}
	public String getValorDo1oCanallVisivelEmSeu5oPeriodo() {
		return valorDo1oCanallVisivelEmSeu5oPeriodo;
	}
	public void setValorDo1oCanallVisivelEmSeu5oPeriodo(String valorDo1oCanallVisivelEmSeu5oPeriodo) {
		this.valorDo1oCanallVisivelEmSeu5oPeriodo = valorDo1oCanallVisivelEmSeu5oPeriodo;
	}
	public String getValorDo2oCanallVisivelEmSeu5oPeriodo() {
		return valorDo2oCanallVisivelEmSeu5oPeriodo;
	}
	public void setValorDo2oCanallVisivelEmSeu5oPeriodo(String valorDo2oCanallVisivelEmSeu5oPeriodo) {
		this.valorDo2oCanallVisivelEmSeu5oPeriodo = valorDo2oCanallVisivelEmSeu5oPeriodo;
	}
	public String getValorDo3oCanallVisivelEmSeu5oPeriodo() {
		return valorDo3oCanallVisivelEmSeu5oPeriodo;
	}
	public void setValorDo3oCanallVisivelEmSeu5oPeriodo(String valorDo3oCanallVisivelEmSeu5oPeriodo) {
		this.valorDo3oCanallVisivelEmSeu5oPeriodo = valorDo3oCanallVisivelEmSeu5oPeriodo;
	}
	public String getValorDo1oCanallVisivelEmSeu6oPeriodo() {
		return valorDo1oCanallVisivelEmSeu6oPeriodo;
	}
	public void setValorDo1oCanallVisivelEmSeu6oPeriodo(String valorDo1oCanallVisivelEmSeu6oPeriodo) {
		this.valorDo1oCanallVisivelEmSeu6oPeriodo = valorDo1oCanallVisivelEmSeu6oPeriodo;
	}
	public String getValorDo2oCanallVisivelEmSeu6oPeriodo() {
		return valorDo2oCanallVisivelEmSeu6oPeriodo;
	}
	public void setValorDo2oCanallVisivelEmSeu6oPeriodo(String valorDo2oCanallVisivelEmSeu6oPeriodo) {
		this.valorDo2oCanallVisivelEmSeu6oPeriodo = valorDo2oCanallVisivelEmSeu6oPeriodo;
	}
	public String getValorDo3oCanallVisivelEmSeu6oPeriodo() {
		return valorDo3oCanallVisivelEmSeu6oPeriodo;
	}
	public void setValorDo3oCanallVisivelEmSeu6oPeriodo(String valorDo3oCanallVisivelEmSeu6oPeriodo) {
		this.valorDo3oCanallVisivelEmSeu6oPeriodo = valorDo3oCanallVisivelEmSeu6oPeriodo;
	}
	public String getValorDo1oCanallVisivelEmSeu7oPeriodo() {
		return valorDo1oCanallVisivelEmSeu7oPeriodo;
	}
	public void setValorDo1oCanallVisivelEmSeu7oPeriodo(String valorDo1oCanallVisivelEmSeu7oPeriodo) {
		this.valorDo1oCanallVisivelEmSeu7oPeriodo = valorDo1oCanallVisivelEmSeu7oPeriodo;
	}
	public String getValorDo2oCanallVisivelEmSeu7oPeriodo() {
		return valorDo2oCanallVisivelEmSeu7oPeriodo;
	}
	public void setValorDo2oCanallVisivelEmSeu7oPeriodo(String valorDo2oCanallVisivelEmSeu7oPeriodo) {
		this.valorDo2oCanallVisivelEmSeu7oPeriodo = valorDo2oCanallVisivelEmSeu7oPeriodo;
	}
	public String getValorDo3oCanallVisivelEmSeu7oPeriodo() {
		return valorDo3oCanallVisivelEmSeu7oPeriodo;
	}
	public void setValorDo3oCanallVisivelEmSeu7oPeriodo(String valorDo3oCanallVisivelEmSeu7oPeriodo) {
		this.valorDo3oCanallVisivelEmSeu7oPeriodo = valorDo3oCanallVisivelEmSeu7oPeriodo;
	}
	public String getValorDo1oCanallVisivelEmSeu8oPeriodo() {
		return valorDo1oCanallVisivelEmSeu8oPeriodo;
	}
	public void setValorDo1oCanallVisivelEmSeu8oPeriodo(String valorDo1oCanallVisivelEmSeu8oPeriodo) {
		this.valorDo1oCanallVisivelEmSeu8oPeriodo = valorDo1oCanallVisivelEmSeu8oPeriodo;
	}
	public String getValorDo2oCanallVisivelEmSeu8oPeriodo() {
		return valorDo2oCanallVisivelEmSeu8oPeriodo;
	}
	public void setValorDo2oCanallVisivelEmSeu8oPeriodo(String valorDo2oCanallVisivelEmSeu8oPeriodo) {
		this.valorDo2oCanallVisivelEmSeu8oPeriodo = valorDo2oCanallVisivelEmSeu8oPeriodo;
	}
	public String getValorDo3oCanallVisivelEmSeu8oPeriodo() {
		return valorDo3oCanallVisivelEmSeu8oPeriodo;
	}
	public void setValorDo3oCanallVisivelEmSeu8oPeriodo(String valorDo3oCanallVisivelEmSeu8oPeriodo) {
		this.valorDo3oCanallVisivelEmSeu8oPeriodo = valorDo3oCanallVisivelEmSeu8oPeriodo;
	}
	public String getValorDo1oCanallVisivelEmSeu9oPeriodo() {
		return valorDo1oCanallVisivelEmSeu9oPeriodo;
	}
	public void setValorDo1oCanallVisivelEmSeu9oPeriodo(String valorDo1oCanallVisivelEmSeu9oPeriodo) {
		this.valorDo1oCanallVisivelEmSeu9oPeriodo = valorDo1oCanallVisivelEmSeu9oPeriodo;
	}
	public String getValorDo2oCanallVisivelEmSeu9oPeriodo() {
		return valorDo2oCanallVisivelEmSeu9oPeriodo;
	}
	public void setValorDo2oCanallVisivelEmSeu9oPeriodo(String valorDo2oCanallVisivelEmSeu9oPeriodo) {
		this.valorDo2oCanallVisivelEmSeu9oPeriodo = valorDo2oCanallVisivelEmSeu9oPeriodo;
	}
	public String getValorDo3oCanallVisivelEmSeu9oPeriodo() {
		return valorDo3oCanallVisivelEmSeu9oPeriodo;
	}
	public void setValorDo3oCanallVisivelEmSeu9oPeriodo(String valorDo3oCanallVisivelEmSeu9oPeriodo) {
		this.valorDo3oCanallVisivelEmSeu9oPeriodo = valorDo3oCanallVisivelEmSeu9oPeriodo;
	}
	public String getValorDo1oCanallVisivelEmSeu10oPeriodo() {
		return valorDo1oCanallVisivelEmSeu10oPeriodo;
	}
	public void setValorDo1oCanallVisivelEmSeu10oPeriodo(String valorDo1oCanallVisivelEmSeu10oPeriodo) {
		this.valorDo1oCanallVisivelEmSeu10oPeriodo = valorDo1oCanallVisivelEmSeu10oPeriodo;
	}
	public String getValorDo2oCanallVisivelEmSeu10oPeriodo() {
		return valorDo2oCanallVisivelEmSeu10oPeriodo;
	}
	public void setValorDo2oCanallVisivelEmSeu10oPeriodo(String valorDo2oCanallVisivelEmSeu10oPeriodo) {
		this.valorDo2oCanallVisivelEmSeu10oPeriodo = valorDo2oCanallVisivelEmSeu10oPeriodo;
	}
	public String getValorDo3oCanallVisivelEmSeu10oPeriodo() {
		return valorDo3oCanallVisivelEmSeu10oPeriodo;
	}
	public void setValorDo3oCanallVisivelEmSeu10oPeriodo(String valorDo3oCanallVisivelEmSeu10oPeriodo) {
		this.valorDo3oCanallVisivelEmSeu10oPeriodo = valorDo3oCanallVisivelEmSeu10oPeriodo;
	}
	public String getValorDo1oCanallVisivelEmSeu11oPeriodo() {
		return valorDo1oCanallVisivelEmSeu11oPeriodo;
	}
	public void setValorDo1oCanallVisivelEmSeu11oPeriodo(String valorDo1oCanallVisivelEmSeu11oPeriodo) {
		this.valorDo1oCanallVisivelEmSeu11oPeriodo = valorDo1oCanallVisivelEmSeu11oPeriodo;
	}
	public String getValorDo2oCanallVisivelEmSeu11oPeriodo() {
		return valorDo2oCanallVisivelEmSeu11oPeriodo;
	}
	public void setValorDo2oCanallVisivelEmSeu11oPeriodo(String valorDo2oCanallVisivelEmSeu11oPeriodo) {
		this.valorDo2oCanallVisivelEmSeu11oPeriodo = valorDo2oCanallVisivelEmSeu11oPeriodo;
	}
	public String getValorDo3oCanallVisivelEmSeu11oPeriodo() {
		return valorDo3oCanallVisivelEmSeu11oPeriodo;
	}
	public void setValorDo3oCanallVisivelEmSeu11oPeriodo(String valorDo3oCanallVisivelEmSeu11oPeriodo) {
		this.valorDo3oCanallVisivelEmSeu11oPeriodo = valorDo3oCanallVisivelEmSeu11oPeriodo;
	}
	public String getValorDo1oCanallVisivelEmSeu12oPeriodo() {
		return valorDo1oCanallVisivelEmSeu12oPeriodo;
	}
	public void setValorDo1oCanallVisivelEmSeu12oPeriodo(String valorDo1oCanallVisivelEmSeu12oPeriodo) {
		this.valorDo1oCanallVisivelEmSeu12oPeriodo = valorDo1oCanallVisivelEmSeu12oPeriodo;
	}
	public String getValorDo2oCanallVisivelEmSeu12oPeriodo() {
		return valorDo2oCanallVisivelEmSeu12oPeriodo;
	}
	public void setValorDo2oCanallVisivelEmSeu12oPeriodo(String valorDo2oCanallVisivelEmSeu12oPeriodo) {
		this.valorDo2oCanallVisivelEmSeu12oPeriodo = valorDo2oCanallVisivelEmSeu12oPeriodo;
	}
	public String getValorDo3oCanallVisivelEmSeu12oPeriodo() {
		return valorDo3oCanallVisivelEmSeu12oPeriodo;
	}
	public void setValorDo3oCanallVisivelEmSeu12oPeriodo(String valorDo3oCanallVisivelEmSeu12oPeriodo) {
		this.valorDo3oCanallVisivelEmSeu12oPeriodo = valorDo3oCanallVisivelEmSeu12oPeriodo;
	}
	public String getValorDo1oCanallVisivelEmSeu13oPeriodo() {
		return valorDo1oCanallVisivelEmSeu13oPeriodo;
	}
	public void setValorDo1oCanallVisivelEmSeu13oPeriodo(String valorDo1oCanallVisivelEmSeu13oPeriodo) {
		this.valorDo1oCanallVisivelEmSeu13oPeriodo = valorDo1oCanallVisivelEmSeu13oPeriodo;
	}
	public String getValorDo2oCanallVisivelEmSeu13oPeriodo() {
		return valorDo2oCanallVisivelEmSeu13oPeriodo;
	}
	public void setValorDo2oCanallVisivelEmSeu13oPeriodo(String valorDo2oCanallVisivelEmSeu13oPeriodo) {
		this.valorDo2oCanallVisivelEmSeu13oPeriodo = valorDo2oCanallVisivelEmSeu13oPeriodo;
	}
	public String getValorDo3oCanallVisivelEmSeu13oPeriodo() {
		return valorDo3oCanallVisivelEmSeu13oPeriodo;
	}
	public void setValorDo3oCanallVisivelEmSeu13oPeriodo(String valorDo3oCanallVisivelEmSeu13oPeriodo) {
		this.valorDo3oCanallVisivelEmSeu13oPeriodo = valorDo3oCanallVisivelEmSeu13oPeriodo;
	}
	public String getValorDo1oCanallVisivelEmSeu14oPeriodo() {
		return valorDo1oCanallVisivelEmSeu14oPeriodo;
	}
	public void setValorDo1oCanallVisivelEmSeu14oPeriodo(String valorDo1oCanallVisivelEmSeu14oPeriodo) {
		this.valorDo1oCanallVisivelEmSeu14oPeriodo = valorDo1oCanallVisivelEmSeu14oPeriodo;
	}
	public String getValorDo2oCanallVisivelEmSeu14oPeriodo() {
		return valorDo2oCanallVisivelEmSeu14oPeriodo;
	}
	public void setValorDo2oCanallVisivelEmSeu14oPeriodo(String valorDo2oCanallVisivelEmSeu14oPeriodo) {
		this.valorDo2oCanallVisivelEmSeu14oPeriodo = valorDo2oCanallVisivelEmSeu14oPeriodo;
	}
	public String getValorDo3oCanallVisivelEmSeu14oPeriodo() {
		return valorDo3oCanallVisivelEmSeu14oPeriodo;
	}
	public void setValorDo3oCanallVisivelEmSeu14oPeriodo(String valorDo3oCanallVisivelEmSeu14oPeriodo) {
		this.valorDo3oCanallVisivelEmSeu14oPeriodo = valorDo3oCanallVisivelEmSeu14oPeriodo;
	}
	public String getValorDo1oCanallVisivelEmSeu15oPeriodo() {
		return valorDo1oCanallVisivelEmSeu15oPeriodo;
	}
	public void setValorDo1oCanallVisivelEmSeu15oPeriodo(String valorDo1oCanallVisivelEmSeu15oPeriodo) {
		this.valorDo1oCanallVisivelEmSeu15oPeriodo = valorDo1oCanallVisivelEmSeu15oPeriodo;
	}
	public String getValorDo2oCanallVisivelEmSeu15oPeriodo() {
		return valorDo2oCanallVisivelEmSeu15oPeriodo;
	}
	public void setValorDo2oCanallVisivelEmSeu15oPeriodo(String valorDo2oCanallVisivelEmSeu15oPeriodo) {
		this.valorDo2oCanallVisivelEmSeu15oPeriodo = valorDo2oCanallVisivelEmSeu15oPeriodo;
	}
	public String getValorDo3oCanallVisivelEmSeu15oPeriodo() {
		return valorDo3oCanallVisivelEmSeu15oPeriodo;
	}
	public void setValorDo3oCanallVisivelEmSeu15oPeriodo(String valorDo3oCanallVisivelEmSeu15oPeriodo) {
		this.valorDo3oCanallVisivelEmSeu15oPeriodo = valorDo3oCanallVisivelEmSeu15oPeriodo;
	}
	public String getValorDo1oCanallVisivelEmSeu16oPeriodo() {
		return valorDo1oCanallVisivelEmSeu16oPeriodo;
	}
	public void setValorDo1oCanallVisivelEmSeu16oPeriodo(String valorDo1oCanallVisivelEmSeu16oPeriodo) {
		this.valorDo1oCanallVisivelEmSeu16oPeriodo = valorDo1oCanallVisivelEmSeu16oPeriodo;
	}
	public String getValorDo2oCanallVisivelEmSeu16oPeriodo() {
		return valorDo2oCanallVisivelEmSeu16oPeriodo;
	}
	public void setValorDo2oCanallVisivelEmSeu16oPeriodo(String valorDo2oCanallVisivelEmSeu16oPeriodo) {
		this.valorDo2oCanallVisivelEmSeu16oPeriodo = valorDo2oCanallVisivelEmSeu16oPeriodo;
	}
	public String getValorDo3oCanallVisivelEmSeu16oPeriodo() {
		return valorDo3oCanallVisivelEmSeu16oPeriodo;
	}
	public void setValorDo3oCanallVisivelEmSeu16oPeriodo(String valorDo3oCanallVisivelEmSeu16oPeriodo) {
		this.valorDo3oCanallVisivelEmSeu16oPeriodo = valorDo3oCanallVisivelEmSeu16oPeriodo;
	}
	public String getValorDo1oCanallVisivelEmSeu17oPeriodo() {
		return valorDo1oCanallVisivelEmSeu17oPeriodo;
	}
	public void setValorDo1oCanallVisivelEmSeu17oPeriodo(String valorDo1oCanallVisivelEmSeu17oPeriodo) {
		this.valorDo1oCanallVisivelEmSeu17oPeriodo = valorDo1oCanallVisivelEmSeu17oPeriodo;
	}
	public String getValorDo2oCanallVisivelEmSeu17oPeriodo() {
		return valorDo2oCanallVisivelEmSeu17oPeriodo;
	}
	public void setValorDo2oCanallVisivelEmSeu17oPeriodo(String valorDo2oCanallVisivelEmSeu17oPeriodo) {
		this.valorDo2oCanallVisivelEmSeu17oPeriodo = valorDo2oCanallVisivelEmSeu17oPeriodo;
	}
	public String getValorDo3oCanallVisivelEmSeu17oPeriodo() {
		return valorDo3oCanallVisivelEmSeu17oPeriodo;
	}
	public void setValorDo3oCanallVisivelEmSeu17oPeriodo(String valorDo3oCanallVisivelEmSeu17oPeriodo) {
		this.valorDo3oCanallVisivelEmSeu17oPeriodo = valorDo3oCanallVisivelEmSeu17oPeriodo;
	}
	public String getValorDo1oCanallVisivelEmSeu18oPeriodo() {
		return valorDo1oCanallVisivelEmSeu18oPeriodo;
	}
	public void setValorDo1oCanallVisivelEmSeu18oPeriodo(String valorDo1oCanallVisivelEmSeu18oPeriodo) {
		this.valorDo1oCanallVisivelEmSeu18oPeriodo = valorDo1oCanallVisivelEmSeu18oPeriodo;
	}
	public String getValorDo2oCanallVisivelEmSeu18oPeriodo() {
		return valorDo2oCanallVisivelEmSeu18oPeriodo;
	}
	public void setValorDo2oCanallVisivelEmSeu18oPeriodo(String valorDo2oCanallVisivelEmSeu18oPeriodo) {
		this.valorDo2oCanallVisivelEmSeu18oPeriodo = valorDo2oCanallVisivelEmSeu18oPeriodo;
	}
	public String getValorDo3oCanallVisivelEmSeu18oPeriodo() {
		return valorDo3oCanallVisivelEmSeu18oPeriodo;
	}
	public void setValorDo3oCanallVisivelEmSeu18oPeriodo(String valorDo3oCanallVisivelEmSeu18oPeriodo) {
		this.valorDo3oCanallVisivelEmSeu18oPeriodo = valorDo3oCanallVisivelEmSeu18oPeriodo;
	}
	public String getValorDo1oCanallVisivelEmSeu19oPeriodo() {
		return valorDo1oCanallVisivelEmSeu19oPeriodo;
	}
	public void setValorDo1oCanallVisivelEmSeu19oPeriodo(String valorDo1oCanallVisivelEmSeu19oPeriodo) {
		this.valorDo1oCanallVisivelEmSeu19oPeriodo = valorDo1oCanallVisivelEmSeu19oPeriodo;
	}
	public String getValorDo2oCanallVisivelEmSeu19oPeriodo() {
		return valorDo2oCanallVisivelEmSeu19oPeriodo;
	}
	public void setValorDo2oCanallVisivelEmSeu19oPeriodo(String valorDo2oCanallVisivelEmSeu19oPeriodo) {
		this.valorDo2oCanallVisivelEmSeu19oPeriodo = valorDo2oCanallVisivelEmSeu19oPeriodo;
	}
	public String getValorDo3oCanallVisivelEmSeu19oPeriodo() {
		return valorDo3oCanallVisivelEmSeu19oPeriodo;
	}
	public void setValorDo3oCanallVisivelEmSeu19oPeriodo(String valorDo3oCanallVisivelEmSeu19oPeriodo) {
		this.valorDo3oCanallVisivelEmSeu19oPeriodo = valorDo3oCanallVisivelEmSeu19oPeriodo;
	}
	public String getValorDo1oCanallVisivelEmSeu20oPeriodo() {
		return valorDo1oCanallVisivelEmSeu20oPeriodo;
	}
	public void setValorDo1oCanallVisivelEmSeu20oPeriodo(String valorDo1oCanallVisivelEmSeu20oPeriodo) {
		this.valorDo1oCanallVisivelEmSeu20oPeriodo = valorDo1oCanallVisivelEmSeu20oPeriodo;
	}
	public String getValorDo2oCanallVisivelEmSeu20oPeriodo() {
		return valorDo2oCanallVisivelEmSeu20oPeriodo;
	}
	public void setValorDo2oCanallVisivelEmSeu20oPeriodo(String valorDo2oCanallVisivelEmSeu20oPeriodo) {
		this.valorDo2oCanallVisivelEmSeu20oPeriodo = valorDo2oCanallVisivelEmSeu20oPeriodo;
	}
	public String getValorDo3oCanallVisivelEmSeu20oPeriodo() {
		return valorDo3oCanallVisivelEmSeu20oPeriodo;
	}
	public void setValorDo3oCanallVisivelEmSeu20oPeriodo(String valorDo3oCanallVisivelEmSeu20oPeriodo) {
		this.valorDo3oCanallVisivelEmSeu20oPeriodo = valorDo3oCanallVisivelEmSeu20oPeriodo;
	}
	public String getValorDo1oCanallVisivelEmSeu21oPeriodo() {
		return valorDo1oCanallVisivelEmSeu21oPeriodo;
	}
	public void setValorDo1oCanallVisivelEmSeu21oPeriodo(String valorDo1oCanallVisivelEmSeu21oPeriodo) {
		this.valorDo1oCanallVisivelEmSeu21oPeriodo = valorDo1oCanallVisivelEmSeu21oPeriodo;
	}
	public String getValorDo2oCanallVisivelEmSeu21oPeriodo() {
		return valorDo2oCanallVisivelEmSeu21oPeriodo;
	}
	public void setValorDo2oCanallVisivelEmSeu21oPeriodo(String valorDo2oCanallVisivelEmSeu21oPeriodo) {
		this.valorDo2oCanallVisivelEmSeu21oPeriodo = valorDo2oCanallVisivelEmSeu21oPeriodo;
	}
	public String getValorDo3oCanallVisivelEmSeu21oPeriodo() {
		return valorDo3oCanallVisivelEmSeu21oPeriodo;
	}
	public void setValorDo3oCanallVisivelEmSeu21oPeriodo(String valorDo3oCanallVisivelEmSeu21oPeriodo) {
		this.valorDo3oCanallVisivelEmSeu21oPeriodo = valorDo3oCanallVisivelEmSeu21oPeriodo;
	}
	public String getValorDo1oCanallVisivelEmSeu22oPeriodo() {
		return valorDo1oCanallVisivelEmSeu22oPeriodo;
	}
	public void setValorDo1oCanallVisivelEmSeu22oPeriodo(String valorDo1oCanallVisivelEmSeu22oPeriodo) {
		this.valorDo1oCanallVisivelEmSeu22oPeriodo = valorDo1oCanallVisivelEmSeu22oPeriodo;
	}
	public String getValorDo2oCanallVisivelEmSeu22oPeriodo() {
		return valorDo2oCanallVisivelEmSeu22oPeriodo;
	}
	public void setValorDo2oCanallVisivelEmSeu22oPeriodo(String valorDo2oCanallVisivelEmSeu22oPeriodo) {
		this.valorDo2oCanallVisivelEmSeu22oPeriodo = valorDo2oCanallVisivelEmSeu22oPeriodo;
	}
	public String getValorDo3oCanallVisivelEmSeu22oPeriodo() {
		return valorDo3oCanallVisivelEmSeu22oPeriodo;
	}
	public void setValorDo3oCanallVisivelEmSeu22oPeriodo(String valorDo3oCanallVisivelEmSeu22oPeriodo) {
		this.valorDo3oCanallVisivelEmSeu22oPeriodo = valorDo3oCanallVisivelEmSeu22oPeriodo;
	}
	public String getValorDo1oCanallVisivelEmSeu23oPeriodo() {
		return valorDo1oCanallVisivelEmSeu23oPeriodo;
	}
	public void setValorDo1oCanallVisivelEmSeu23oPeriodo(String valorDo1oCanallVisivelEmSeu23oPeriodo) {
		this.valorDo1oCanallVisivelEmSeu23oPeriodo = valorDo1oCanallVisivelEmSeu23oPeriodo;
	}
	public String getValorDo2oCanallVisivelEmSeu23oPeriodo() {
		return valorDo2oCanallVisivelEmSeu23oPeriodo;
	}
	public void setValorDo2oCanallVisivelEmSeu23oPeriodo(String valorDo2oCanallVisivelEmSeu23oPeriodo) {
		this.valorDo2oCanallVisivelEmSeu23oPeriodo = valorDo2oCanallVisivelEmSeu23oPeriodo;
	}
	public String getValorDo3oCanallVisivelEmSeu23oPeriodo() {
		return valorDo3oCanallVisivelEmSeu23oPeriodo;
	}
	public void setValorDo3oCanallVisivelEmSeu23oPeriodo(String valorDo3oCanallVisivelEmSeu23oPeriodo) {
		this.valorDo3oCanallVisivelEmSeu23oPeriodo = valorDo3oCanallVisivelEmSeu23oPeriodo;
	}
	public String getValorDo1oCanallVisivelEmSeu24oPeriodo() {
		return valorDo1oCanallVisivelEmSeu24oPeriodo;
	}
	public void setValorDo1oCanallVisivelEmSeu24oPeriodo(String valorDo1oCanallVisivelEmSeu24oPeriodo) {
		this.valorDo1oCanallVisivelEmSeu24oPeriodo = valorDo1oCanallVisivelEmSeu24oPeriodo;
	}
	public String getValorDo2oCanallVisivelEmSeu24oPeriodo() {
		return valorDo2oCanallVisivelEmSeu24oPeriodo;
	}
	public void setValorDo2oCanallVisivelEmSeu24oPeriodo(String valorDo2oCanallVisivelEmSeu24oPeriodo) {
		this.valorDo2oCanallVisivelEmSeu24oPeriodo = valorDo2oCanallVisivelEmSeu24oPeriodo;
	}
	public String getValorDo3oCanallVisivelEmSeu24oPeriodo() {
		return valorDo3oCanallVisivelEmSeu24oPeriodo;
	}
	public void setValorDo3oCanallVisivelEmSeu24oPeriodo(String valorDo3oCanallVisivelEmSeu24oPeriodo) {
		this.valorDo3oCanallVisivelEmSeu24oPeriodo = valorDo3oCanallVisivelEmSeu24oPeriodo;
	}
	
}