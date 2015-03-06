package br.com.easydoctor.bean;

public class ConsultaBean {
	private int id;
	private String hist_preg_mol;
	private String inter_div_apa;
	private int medico;
	private int paciente;
	private String q_dura;

	public ConsultaBean(int id, String hist_preg_mol, String inter_div_apa,
			int medico, int paciente, String q_dura) {
		super();
		this.id = id;
		this.hist_preg_mol = hist_preg_mol;
		this.inter_div_apa = inter_div_apa;
		this.medico = medico;
		this.paciente = paciente;
		this.q_dura = q_dura;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHist_preg_mol() {
		return hist_preg_mol;
	}

	public void setHist_preg_mol(String hist_preg_mol) {
		this.hist_preg_mol = hist_preg_mol;
	}

	public String getInter_div_apa() {
		return inter_div_apa;
	}

	public void setInter_div_apa(String inter_div_apa) {
		this.inter_div_apa = inter_div_apa;
	}

	public int getMedico() {
		return medico;
	}

	public void setMedico(int medico) {
		this.medico = medico;
	}

	public int getPaciente() {
		return paciente;
	}

	public void setPaciente(int paciente) {
		this.paciente = paciente;
	}

	public String getQ_dura() {
		return q_dura;
	}

	public void setQ_dura(String q_dura) {
		this.q_dura = q_dura;
	}



}
