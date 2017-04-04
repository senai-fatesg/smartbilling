package br.com.pid.smartbilling.util;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;


public abstract class GerenciadorSessao {

	private final String SESSOES = "__sessoes";

	public static void adicionarSessao(String nome) {
		try {
			HttpServletRequest request = UtilFaces.getRequest();
			List<String> sessoes = (List)request.getSession().getAttribute("__sessoes");
			if (sessoes == null) {
				sessoes = new ArrayList<>();
			}
			sessoes.add(nome);
			request.getSession().setAttribute("__sessoes", sessoes);
			UtilLog.getLog().debug(String.format("Adicionando a sessao: %s", new Object[] { nome }));
		} catch (Exception e) {
			UtilLog.getLog().error(e.getMessage(), e);
		}
	}

	public static void removerSessao(String nome) {
		try {
			HttpServletRequest request = UtilFaces.getRequest();
			List<String> sessoes = (List)request.getSession().getAttribute("__sessoes");
			if (sessoes != null) {
				sessoes.remove(nome);
				UtilLog.getLog().debug(String.format("Removendo a sessao: %s", new Object[] { nome }));
			}
		} catch (Exception e) {
			UtilLog.getLog().error(e.getMessage(), e);
		}
	}

	public static void limparSessoes() {
		try {
			HttpServletRequest request = UtilFaces.getRequest();
			List<String> sessoes = (List<String>) request.getSession().getAttribute("__sessoes");
			if (sessoes != null) {
				for (String sessao : sessoes)
				{
					request.getSession().removeAttribute(sessao);
					UtilLog.getLog().debug(String.format("Removendo a sessao: %s", new Object[] { sessao }));
				}
			}
			sessoes = new ArrayList<>();
			request.getSession().setAttribute("__sessoes", sessoes);
		} catch (Exception e) {
			UtilLog.getLog().error(e.getMessage(), e);
		}
	}

	public String getSESSOES() {
		return SESSOES;
	}

}

