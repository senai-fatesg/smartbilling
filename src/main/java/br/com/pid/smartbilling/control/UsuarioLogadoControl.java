package br.com.pid.smartbilling.control;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.context.annotation.SessionScope;

import br.com.pid.smartbilling.model.Usuario;
import br.com.pid.smartbilling.repository.UsuarioDaoRepository;


@Named
@SessionScope
public class UsuarioLogadoControl implements Serializable {

	private static final long serialVersionUID = 1L;

	private Usuario usuario;

	@Autowired
	private UsuarioDaoRepository usuarioDao;

	@PostConstruct
	public void init() {
		consultarUsuarioLogado();
	}


	private void consultarUsuarioLogado(){
		String username;
		try {
			Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

			if (principal instanceof UserDetails) {
				username = ((UserDetails)principal).getUsername();
			} else {
				username = principal.toString();
			}
//			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
			usuario = (Usuario) usuarioDao.findUsersByRegexpName(username);
		} catch(Exception e){
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), "Erro ao consultar usuário logado.");
			FacesContext.getCurrentInstance().addMessage(null, message);
		}
	}


//	public static Usuario getUsuarioConfigurado() {
//		return (Usuario) UtilFaces.getObjetoManagedBean("#{UsuarioLogadoControl.usuario}");
//	}

	@Override
	public String toString() {
		return usuario != null ? String.format("%s", usuario) : "***";
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


}
