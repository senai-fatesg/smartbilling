package br.com.pid.smartbilling.control;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.annotation.SessionScope;

import br.com.pid.smartbilling.model.EnumPapelUsuario;
import br.com.pid.smartbilling.model.EnumUf;
import br.com.pid.smartbilling.model.Municipio;
import br.com.pid.smartbilling.model.Usuario;
import br.com.pid.smartbilling.repository.MunicipioDaoRepository;
import br.com.pid.smartbilling.repository.UsuarioDaoRepository;
import br.com.pid.smartbilling.util.UtilMd5;

@Named
@SessionScope
public class UsuarioControl {

	private Usuario usuario = new Usuario();

	private Usuario usuarioAlterar = new Usuario();

	private EnumPapelUsuario papel;

	private String nome;

	private String senha1;

	private String senha2;

	private EnumUf uf;

	@Autowired
	private UsuarioLogadoControl usuarioLogadoControl;

	@Autowired
	private MunicipioDaoRepository municipioDao;

	@Autowired
	private UsuarioDaoRepository usuarioDaoRepository;

	private List<Usuario> usuarios = new ArrayList<>();

	private List<Municipio> municipios = new ArrayList<>();


	@PostConstruct
	public void init(){
		if(usuario != null && usuario.getMunicipio() != null){
			uf = usuario.getMunicipio().getUf();
		}else{
			uf = EnumUf.GO;
		}
		listaMunicipiosPorUfs();
		listar();
	}

	public void salvar(){
		if (this.usuario != null) {
			this.usuario.setSenhaNaoCriptografada("123456");
			this.usuario.setDataCadastro(new Date());
			Municipio municipio = municipioDao.buscarPorCodigoIbge(5208707);
			this.usuario.setMunicipio(municipio);
			this.usuario.getPapeis().add(EnumPapelUsuario.USUARIO);
			usuarioDaoRepository.save(usuario);
			listar();
			FacesMessage message = new FacesMessage("Usuário", usuario.getNome() + " salvo com sucesso.");
			FacesContext.getCurrentInstance().addMessage(null, message);
		}else{
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro ao salvar ", " verifique os campos preenchidos");
			FacesContext.getCurrentInstance().addMessage(null, message);
		}
	}
	
	public void alterar(){
		if (this.usuarioAlterar != null) {
			this.usuario = usuarioAlterar;
			usuarioDaoRepository.save(this.usuario);
			FacesMessage message = new FacesMessage("Usuário", usuario.getNome() + " Registro salvo com sucesso.");
			FacesContext.getCurrentInstance().addMessage(null, message);
		}
	}

	public void listar(){
		try{
			usuarios = usuarioDaoRepository.findAll();
		} catch (Exception e) {
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), "Erro ao listar usuários.");
			FacesContext.getCurrentInstance().addMessage(null, message);
		}
	}

	public void listarPorNome(){
		try{
			usuarios = new ArrayList<>();
			usuarios = usuarioDaoRepository.findUsersByRegexpName(nome);
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), "Erro ao listar usuários por nome."));
		}
	}

	public List<Municipio> listarMunicipios(String descricao) {
		try {
			return municipioDao.listarPorUfNome(null, descricao);
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "Não existe município com esta descrição."));
			return new ArrayList<Municipio>();
		}
	}

	public void listaMunicipiosPorUfs() {
		try {
			municipios = municipioDao.listarPorUfNome(uf, null);
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), "Erro ao listar municipios."));
		}
	}

	public void adicionarPapel(){
		try{
			usuarioAlterar.addPapel(papel);
		}catch(Exception e){
			FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), "Erro.");
		}
	}

	public void removerPapel(ActionEvent evt){
		try{
			//usuarioAlterar.removerPapel((EnumPapelUsuario) UtilFaces.getValorParametro(evt, "papel"));
		}catch(Exception e){
			FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), "Erro ao remover o papel do usuário.");
		}
	}

	public void limpar(){
		usuario = new Usuario();
		usuarioAlterar = new Usuario();
	}

	public void editarUsuario(Usuario usuarioParam){
		this.usuarioAlterar = usuarioParam;
	}

	public String alterarSenha() {
		try {
			String senhaAtualCripto = UtilMd5.gerarMd5(usuario.getConfirmaSenha());
			Usuario usuarioLogado = usuarioLogadoControl.getUsuario();
			if (senhaAtualCripto.equals(usuarioLogado.getSenha())) {
				if (senha1 != null && senha1.equals(senha2)) {
					usuarioLogado.setSenhaNaoCriptografada(senha1);
					usuarioDaoRepository.save(usuarioLogado);
					FacesMessage message = new FacesMessage("senha alterada com sucesso.");
					FacesContext.getCurrentInstance().addMessage("Usuário: " + usuarioLogado.getNome(), message);
					return "inicio.jsf";
				} else {
					FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, null, "Senhas diferentes.");
					FacesContext.getCurrentInstance().addMessage(null, message);
				}
			} else {
				FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, null, "Senha atual incorreta.");
				FacesContext.getCurrentInstance().addMessage(null, message);
			}
		} catch (Exception e) {
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), "Erro ao alterar as senhas.");
			FacesContext.getCurrentInstance().addMessage(null, message);;
		}
		return "alterarSenha.secima";
	}

	public List<EnumPapelUsuario> getPapeis(){
		return Arrays.asList(EnumPapelUsuario.values());
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Usuario getUsuarioAlterar() {
		return usuarioAlterar;
	}

	public void setUsuarioAlterar(Usuario usuarioAlterar) {
		this.usuarioAlterar = usuarioAlterar;
	}

	public EnumPapelUsuario getPapel() {
		return papel;
	}

	public void setPapel(EnumPapelUsuario papel) {
		this.papel = papel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha1() {
		return senha1;
	}

	public void setSenha1(String senha1) {
		this.senha1 = senha1;
	}

	public String getSenha2() {
		return senha2;
	}

	public void setSenha2(String senha2) {
		this.senha2 = senha2;
	}

	public EnumUf getUf() {
		return uf;
	}

	public void setUf(EnumUf uf) {
		this.uf = uf;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public List<Municipio> getMunicipios() {
		return municipios;
	}

}
