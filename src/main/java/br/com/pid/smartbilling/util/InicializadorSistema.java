package br.com.pid.smartbilling.util;

import java.util.logging.Level;
import java.util.logging.Logger;

import javassist.bytecode.stackmap.TypeData.ClassName;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pid.smartbilling.model.EnumPapelUsuario;
import br.com.pid.smartbilling.model.Usuario;
import br.com.pid.smartbilling.repository.MunicipioDaoRepository;
import br.com.pid.smartbilling.repository.UsuarioDaoRepository;



@Service("inicializadorSistema")
public class InicializadorSistema {
	
	private static final Logger LOGGER = Logger.getLogger(ClassName.class.getName() );

	@Autowired
	private UsuarioDaoRepository usuarioDao;
	
	@Autowired
	private MunicipioDaoRepository municipioDao;
	
	@PostConstruct
	public void iniciar(){
		inicializarUsuarioAdmin();
	}
	
	private void inicializarUsuarioAdmin(){
		try {
			Usuario usuario = usuarioDao.findUserByCpf("111.111.111-11");
			if(usuario == null){
				 usuario = new Usuario();
		            usuario.setNome("Administrador");
		            usuario.setLogin("admin");
		            usuario.setCpf("111.111.111-11");
		            usuario.setEmail("admin@admin");
		            usuario.setSenhaNaoCriptografada("123456");
		            usuario.setStatus(true);
		            usuario.setMunicipio(municipioDao.buscarPorCodigoIbge(5208707));
		            usuario.setSenhaNaoCriptografada("123456");
		            usuario.addPapel(EnumPapelUsuario.ADMIN);
		            usuario.addPapel(EnumPapelUsuario.GERENCIA);
		            usuario.addPapel(EnumPapelUsuario.USUARIO);
		            
		            usuarioDao.save(usuario);

		            LOGGER.info("*** USUÁRIO admin CRIADO com a senha 123456 ***");
			}
		} catch (Exception e) {
			LOGGER.log( Level.SEVERE, e.toString(), e );
		}
	}
	
}
