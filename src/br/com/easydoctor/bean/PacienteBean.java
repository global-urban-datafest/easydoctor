package br.com.easydoctor.bean;

import java.math.BigDecimal;
import java.util.Calendar;

public class PacienteBean {

	private int id;
	private String ant_fam_fil;
	private String ant_fam_irm;
	private String ant_fam_mae;
	private String ant_fam_pai;
	private String ant_pes_alergias;
	private String ant_pes_cir_inter_pre;
	private String ant_pes_doencas;
	private String ant_pes_habitos_vicios;
	private String cid_atual;
	private String cid_nasc;
	private BigDecimal cpf;
	private String estado_civil;
	private Calendar nascimento;
	private String nome;
	private String profissao;
	private String religiao;
	private String sexo;
	public PacienteBean(int id, String ant_fam_fil, String ant_fam_irm,
			String ant_fam_mae, String ant_fam_pai, String ant_pes_alergias,
			String ant_pes_cir_inter_pre, String ant_pes_doencas,
			String ant_pes_habitos_vicios, String cid_atual, String cid_nasc,
			BigDecimal cpf, String estado_civil, Calendar nascimento,
			String nome, String profissao, String religiao, String sexo) {
		super();
		this.id = id;
		this.ant_fam_fil = ant_fam_fil;
		this.ant_fam_irm = ant_fam_irm;
		this.ant_fam_mae = ant_fam_mae;
		this.ant_fam_pai = ant_fam_pai;
		this.ant_pes_alergias = ant_pes_alergias;
		this.ant_pes_cir_inter_pre = ant_pes_cir_inter_pre;
		this.ant_pes_doencas = ant_pes_doencas;
		this.ant_pes_habitos_vicios = ant_pes_habitos_vicios;
		this.cid_atual = cid_atual;
		this.cid_nasc = cid_nasc;
		this.cpf = cpf;
		this.estado_civil = estado_civil;
		this.nascimento = nascimento;
		this.nome = nome;
		this.profissao = profissao;
		this.religiao = religiao;
		this.sexo = sexo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnt_fam_fil() {
		return ant_fam_fil;
	}
	public void setAnt_fam_fil(String ant_fam_fil) {
		this.ant_fam_fil = ant_fam_fil;
	}
	public String getAnt_fam_irm() {
		return ant_fam_irm;
	}
	public void setAnt_fam_irm(String ant_fam_irm) {
		this.ant_fam_irm = ant_fam_irm;
	}
	public String getAnt_fam_mae() {
		return ant_fam_mae;
	}
	public void setAnt_fam_mae(String ant_fam_mae) {
		this.ant_fam_mae = ant_fam_mae;
	}
	public String getAnt_fam_pai() {
		return ant_fam_pai;
	}
	public void setAnt_fam_pai(String ant_fam_pai) {
		this.ant_fam_pai = ant_fam_pai;
	}
	public String getAnt_pes_alergias() {
		return ant_pes_alergias;
	}
	public void setAnt_pes_alergias(String ant_pes_alergias) {
		this.ant_pes_alergias = ant_pes_alergias;
	}
	public String getAnt_pes_cir_inter_pre() {
		return ant_pes_cir_inter_pre;
	}
	public void setAnt_pes_cir_inter_pre(String ant_pes_cir_inter_pre) {
		this.ant_pes_cir_inter_pre = ant_pes_cir_inter_pre;
	}
	public String getAnt_pes_doencas() {
		return ant_pes_doencas;
	}
	public void setAnt_pes_doencas(String ant_pes_doencas) {
		this.ant_pes_doencas = ant_pes_doencas;
	}
	public String getAnt_pes_habitos_vicios() {
		return ant_pes_habitos_vicios;
	}
	public void setAnt_pes_habitos_vicios(String ant_pes_habitos_vicios) {
		this.ant_pes_habitos_vicios = ant_pes_habitos_vicios;
	}
	public String getCid_atual() {
		return cid_atual;
	}
	public void setCid_atual(String cid_atual) {
		this.cid_atual = cid_atual;
	}
	public String getCid_nasc() {
		return cid_nasc;
	}
	public void setCid_nasc(String cid_nasc) {
		this.cid_nasc = cid_nasc;
	}
	public BigDecimal getCpf() {
		return cpf;
	}
	public void setCpf(BigDecimal cpf) {
		this.cpf = cpf;
	}
	public String getEstado_civil() {
		return estado_civil;
	}
	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
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
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getReligiao() {
		return religiao;
	}
	public void setReligiao(String religiao) {
		this.religiao = religiao;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}




}
