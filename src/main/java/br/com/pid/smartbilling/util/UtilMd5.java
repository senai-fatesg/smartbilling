package br.com.pid.smartbilling.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class UtilMd5 {

	public static String gerarMd5(String senhaNaoCriptografada){

		String senha = senhaNaoCriptografada;
		MessageDigest m;

		try{
			m = MessageDigest.getInstance("MD5");
			
			m.update(senha.getBytes(),0,senha.length());
			BigInteger i = new BigInteger(1, m.digest());
			senha = String.format("%1$032X", i);
			return senha;
			
		} catch (NoSuchAlgorithmException e){
			e.printStackTrace();
		}
		return null;
		
	}
}
