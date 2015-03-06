package br.com.fiap.am.sqlhelper;

import java.util.HashMap;
/*

 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rm66288
 */
public class Usuario implements IDao {

    private int codigo;
    private String login;
    private String senha;

    public Usuario() { }

    public Usuario(int codigo, String login, String senha) {
        this.codigo = codigo;
        this.login = login;
        this.senha = senha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

	@Override
	public void bind(HashMap<String, Object> dados) {
		codigo = 1;
        login = dados.get("COUNTRY_NAME").toString();
        senha = dados.get("COUNTRY_ID").toString();

	}





}
