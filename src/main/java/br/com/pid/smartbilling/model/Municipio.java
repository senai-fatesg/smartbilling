package br.com.pid.smartbilling.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Embeddable
public class Municipio implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String descricao;

    @Enumerated(EnumType.STRING)
    private EnumUf uf;

    private Integer codigoIbge;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public EnumUf getUf() {
        return uf;
    }

    public void setUf(EnumUf uf) {
        this.uf = uf;
    }

    public Integer getCodigoIbge() {
        return codigoIbge;
    }

    public void setCodigoIbge(Integer codigoIbge) {
        this.codigoIbge = codigoIbge;
    }

    @Override
    public String toString() {
        return String.format("%s (%s)", descricao, uf);
    }

}