package br.com.easydoctor.dao;

import br.com.easydoctor.bean.MedicoBean;
import br.com.easydoctor.sqlhelper.SqlHelper;

public class MedicoDAO implements IBaseDao<Integer, MedicoBean> {

	private SqlHelper helper;

	public MedicoDAO(){
		helper = new SqlHelper();
	}

	@Override
	public Integer insert(MedicoBean obj) {
		String cmd = "INSERT INTO [MEDICO] ([ID] ,[CPF],[NOME],[AREA_ATUACAO],[NASCIMENTO])VALUES(?,?,?,?,?)";

		return null;
	}



}
