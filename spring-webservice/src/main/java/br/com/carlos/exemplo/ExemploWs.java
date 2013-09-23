package br.com.carlos.exemplo;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class ExemploWs {
	
	@WebMethod
	public String exemplo(String value){
		return "Exemplo" + value;
	}

}
