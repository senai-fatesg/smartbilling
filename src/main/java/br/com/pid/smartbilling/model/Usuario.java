package br.com.pid.smartbilling.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import br.com.pid.smartbilling.util.UtilMd5;


@Document
public class Usuario implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @NotEmpty
    private String nome;
    
    @NotEmpty
    private String cpf;

    @NotEmpty
    private String login;

    @NotEmpty
    private String senha;

    @Transient
    private String confirmaSenha;

    @NotEmpty
    private String email;

    private Boolean status;
    
    @ElementCollection
    private Municipio municipio;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dataCadastro;

    @ElementCollection(targetClass = EnumPapelUsuario.class,fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    private Set<EnumPapelUsuario> papeis = new HashSet<>();
    
    public List<EnumPapelUsuario> getPapeisList(){
        return new ArrayList<EnumPapelUsuario>(this.papeis);
    }

    public void setSenhaNaoCriptografada(String senha){
        this.senha = UtilMd5.gerarMd5(senha);
    }

    public void addPapel(EnumPapelUsuario papel){
        if(!this.isContemPapel(papel)){
            this.papeis.add(papel);
        }
    }

    public void removerPapel(EnumPapelUsuario papel) {
        if(this.isContemPapel(papel)){
            this.papeis.remove(papel);
        }
    }

    public boolean isContemPapel(EnumPapelUsuario papel){
        if(papeis != null){
            return papeis.contains(papel);
        }else{
            return false;
        }
	}

    public boolean isSenhaValida(String confirmarSenha){
        if(!this.getSenha().equals(confirmarSenha)){
            return true;
        }
        return false;
    }
    
    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getConfirmaSenha() {
        return confirmaSenha;
    }
    public void setConfirmaSenha(String confirmaSenha) {
        this.confirmaSenha = confirmaSenha;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }
    public Date getDataCadastro() {
        return dataCadastro;
    }
    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    public Municipio getMunicipio() {
		return municipio;
    }
	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}
	public Set<EnumPapelUsuario> getPapeis() {
		return papeis;
	}

	@Override
    public String toString() {
        return "Usuario [id=" + id + ", nome=" + nome + ", login=" + login + ", senha=" + senha + ", email=" + email
                + ", status=" + status + ", dataCadastro=" + dataCadastro + "]";
    }
}