package br.com.easydoctor.bean;

import java.util.Calendar;
import java.util.HashMap;

import br.com.easydoctor.sqlhelper.IDao;

public class ExameBean implements IDao{
	private int id;
	private String anexo;
	private int consulta;
	private Calendar data;
	private String descricao;
	private Calendar hora;

	public ExameBean(int id, String anexo, int consulta, Calendar data,
			String descricao, Calendar hora) {
		super();
		this.id = id;
		this.anexo = anexo;
		this.consulta = consulta;
		this.data = data;
		this.descricao = descricao;
		this.hora = hora;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnexo() {
		return anexo;
	}

	public void setAnexo(String anexo) {
		this.anexo = anexo;
	}

	public int getConsulta() {
		return consulta;
	}

	public void setConsulta(int consulta) {
		this.consulta = consulta;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Calendar getHora() {
		return hora;
	}

	public void setHora(Calendar hora) {
		this.hora = hora;
	}

	@Override
	public void bind(HashMap<String, Object> dados) {
		// TODO Auto-generated method stub

	}



}
