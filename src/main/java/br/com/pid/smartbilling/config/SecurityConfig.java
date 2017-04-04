package br.com.pid.smartbilling.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import br.com.pid.smartbilling.model.Usuario;
import br.com.pid.smartbilling.repository.UsuarioDaoRepository;
import br.com.pid.smartbilling.util.InicializadorSistema;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private InicializadorSistema inicializador;

	@Autowired
	private UsuarioDaoRepository usuarioDaoRepository ;

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.csrf().disable();
		http
		.userDetailsService(userDetailsService())
		.authorizeRequests()
		.antMatchers("/smartbilling").permitAll()
		.antMatchers("/index.jsf").permitAll()
		.antMatchers("/javax.faces.resources/**").permitAll()
		.antMatchers("/pages/**").permitAll()
		.anyRequest().authenticated()
		.and()
		.formLogin()
		.loginPage("/login.jsf")
		.usernameParameter("j_username")
        .passwordParameter("j_password")
        .loginProcessingUrl("/j_spring_security_check")
		.permitAll()
		.failureUrl("/login.jsf?error=true").successForwardUrl("/index.jsf")
		.and()
		.logout()
		.logoutSuccessUrl("/login.jsf");

	}
	
	@Override
	public void configure(WebSecurity web) throws Exception {
	    web.ignoring().antMatchers("/resources/**");
	}

	@Override
	protected UserDetailsService userDetailsService() {

		List<Usuario> usuarios = usuarioDaoRepository.findAll();
		
		if (usuarios.isEmpty()) {
			inicializador.iniciar();
		}

		List<UserDetails> users = new ArrayList<>();

		for (Usuario u: usuarios){
			UserDetails user = new User(u.getLogin(), u.getSenha(), AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_"+u.getPapeis()));
			users.add(user);
		}

		return new InMemoryUserDetailsManager(users);
	}
}
