package com.ibm.cloudoe.samples;

import br.com.fiap.am.sqlhelper.SqlHelper;

public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SqlHelper helper = new SqlHelper();
		helper.executeScalar("INSERT INTO MEDICO (ID,CPF,NOME,AREA_ATUACAO,NASCIMENTO)VALUES (1,14562756890,'Paulo Riveira',01/02/1980)");
		System.out.print("passou");
	}

}
