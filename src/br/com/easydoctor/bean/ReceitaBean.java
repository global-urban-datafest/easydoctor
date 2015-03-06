package br.com.easydoctor.bean;

import java.util.Calendar;

public class ReceitaBean {

	private int id;
	private int consulta;
	private Calendar date;
	private Calendar hora;
	private String medicamento;
	private String quant_hora;
	public ReceitaBean(int id, int consulta, Calendar date, Calendar hora,
			String medicamento, String quant_hora) {
		super();
		this.id = id;
		this.consulta = consulta;
		this.date = date;
		this.hora = hora;
		this.medicamento = medicamento;
		this.quant_hora = quant_hora;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getConsulta() {
		return consulta;
	}
	public void setConsulta(int consulta) {
		this.consulta = consulta;
	}
	public Calendar getDate() {
		return date;
	}
	public void setDate(Calendar date) {
		this.date = date;
	}
	public Calendar getHora() {
		return hora;
	}
	public void setHora(Calendar hora) {
		this.hora = hora;
	}
	public String getMedicamento() {
		return medicamento;
	}
	public void setMedicamento(String medicamento) {
		this.medicamento = medicamento;
	}
	public String getQuant_hora() {
		return quant_hora;
	}
	public void setQuant_hora(String quant_hora) {
		this.quant_hora = quant_hora;
	}



}
