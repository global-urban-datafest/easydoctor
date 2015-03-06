package br.com.easydoctor.bean;

import java.util.HashMap;

import br.com.easydoctor.sqlhelper.IDao;

public class MedicoBean implements IDao{

	private int id;


	@Override
	public void bind(HashMap<String, Object> dados) {
		id = dados.get("ID") != null ? Integer.parseInt(dados.get("ID").toString()) : 0;

	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


}
