package br.com.pid.smartbilling.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Embeddable
public class EntidadeGenerica implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
}
