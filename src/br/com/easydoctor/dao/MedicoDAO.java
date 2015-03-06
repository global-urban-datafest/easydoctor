package br.com.easydoctor.dao;

import br.com.easydoctor.bean.MedicoBean;
import br.com.easydoctor.sqlhelper.SqlHelper;
import br.com.easydoctor.sqlhelper.Parametro;


public class MedicoDAO implements IBaseDao<Integer, MedicoBean> {

	private SqlHelper helper;

	public MedicoDAO(){
		helper = new SqlHelper();
	}

	@Override
	public Integer insert(MedicoBean obj) {
		String cmd = "INSERT INTO [MEDICO] ([ID] ,[CPF],[NOME],[AREA_ATUACAO],[NASCIMENTO])VALUES(?,?,?,?,?)";

		Parametro[] param = {
				new Parametro(1, obj.getId()),
				new Parametro(2, obj.getCpf()),
				new Parametro(3, obj.getNome()),
				new Parametro(4, obj.getArea_atuacao()),
				new Parametro(5, obj.getNascimento())
		};

		return helper.executeUpdate(cmd, param);

	}



}
