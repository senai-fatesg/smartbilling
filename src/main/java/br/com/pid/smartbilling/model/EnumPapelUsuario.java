package br.com.pid.smartbilling.model;


public enum EnumPapelUsuario{

    ADMIN("Administrador"),
    USUARIO("Usuário"),
    GERENCIA("Gerência");

    private final String descricao;

    private EnumPapelUsuario(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
