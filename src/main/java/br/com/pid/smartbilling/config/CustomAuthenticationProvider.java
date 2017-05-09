package br.com.pid.smartbilling.config;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import br.com.pid.smartbilling.model.Usuario;
import br.com.pid.smartbilling.repository.UsuarioDaoRepository;
import br.com.pid.smartbilling.util.UtilMd5;
import javassist.bytecode.stackmap.TypeData.ClassName;

@Component
@ComponentScan(basePackages = {"br.com.pid.smartbilling.config"})
public class CustomAuthenticationProvider implements AuthenticationProvider {
	
	private static final Logger LOGGER = Logger.getLogger(ClassName.class.getName() );

	@Inject
	private UsuarioDaoRepository usuarioDao;
	
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        
        String username = authentication.getName();
        String password = UtilMd5.gerarMd5(authentication.getCredentials().toString());
        
        String message = String.format("Username: '%s' Password: '%s'", username, password);
        //Usuario usuario = null;       
        
        if (validate(username, password)) {
        	LOGGER.info(message);
            List<GrantedAuthority> grantedAuths = new ArrayList<>();
            grantedAuths.add(new SimpleGrantedAuthority("USER"));
            return new UsernamePasswordAuthenticationToken(username, authentication, grantedAuths);
        } else {
            String error = String.format("Invalid credentials [%s]", message);
            throw new BadCredentialsException(error);
        }
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
    
    public boolean validate(String username, String password){
    	Usuario usuario = usuarioDao.validateUser(username, password);
    	if (usuario != null){
    		return true;
    	}else{
    		return false;
    	}
		
    }

}