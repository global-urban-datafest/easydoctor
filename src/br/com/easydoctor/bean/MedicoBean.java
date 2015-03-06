package br.com.easydoctor.bean;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.HashMap;

import br.com.easydoctor.sqlhelper.IDao;

public class MedicoBean implements IDao{
	private int id;
	private String area_atuacao;
	private BigDecimal cpf;
	private Calendar nascimento;
	private String nome;
	public MedicoBean(int id, String area_atuacao, BigDecimal cpf,
			Calendar nascimento, String nome) {
		super();
		this.id = id;
		this.area_atuacao = area_atuacao;
		this.cpf = cpf;
		this.nascimento = nascimento;
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getArea_atuacao() {
		return area_atuacao;
	}
	public void setArea_atuacao(String area_atuacao) {
		this.area_atuacao = area_atuacao;
	}
	public BigDecimal getCpf() {
		return cpf;
	}
	public void setCpf(BigDecimal cpf) {
		this.cpf = cpf;
	}
	public Calendar getNascimento() {
		return nascimento;
	}
	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public void bind(HashMap<String, Object> dados) {
		// TODO Auto-generated method stub

	}



}
