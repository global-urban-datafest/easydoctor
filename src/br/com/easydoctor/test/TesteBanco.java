package br.com.easydoctor.test;

import br.com.easydoctor.sqlhelper.SqlHelper;

public class TesteBanco {

	public static void main(String[] args){

		SqlHelper helper = new SqlHelper();
		String cmd = "INSERT INTO [MEDICO]([ID],[CPF],[NOME],[AREA_ATUACAO],[NASCIMENTO])VALUES(8,123456,'Teste','Procto','3-3-1990')";
		helper.executeUpdate(cmd);


	}

}
