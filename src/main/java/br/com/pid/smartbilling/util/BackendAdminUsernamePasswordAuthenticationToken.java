package br.com.pid.smartbilling.util;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public class BackendAdminUsernamePasswordAuthenticationToken extends UsernamePasswordAuthenticationToken {
  
	private static final long serialVersionUID = 1L;

	public BackendAdminUsernamePasswordAuthenticationToken(Object principal, Object credentials) {
        super(principal, credentials);
    }
}