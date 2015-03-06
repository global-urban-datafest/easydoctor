package com.ibm.cloudoe.samples;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import br.com.fiap.am.sqlhelper.SqlHelper;



@Path("/hello")
public class HelloResource {

	@GET
	public String getInformation() {

		// 'VCAP_APPLICATION' is in JSON format, it contains useful information about a deployed application
		// String envApp = System.getenv("VCAP_APPLICATION");

		// 'VCAP_SERVICES' contains all the credentials of services bound to this application.
		// String envServices = System.getenv("VCAP_SERVICES");
		// JSONObject sysEnv = new JSONObject(System.getenv());


		SqlHelper helper = new SqlHelper();
		helper.executeScalar("INSERT INTO MEDICO (ID,CPF,NOME,AREA_ATUACAO,NASCIMENTO)VALUES (1,14562756890,'Paulo Riveira',01/02/1980)");
		System.out.print("passou");

		return "Hi World! LALALALALA";

	}
}


