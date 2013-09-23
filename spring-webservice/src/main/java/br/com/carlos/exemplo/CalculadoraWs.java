package br.com.carlos.exemplo;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public class CalculadoraWs {
	
	@WebMethod
	public double somar(double  val1, double val2){
		return val1+val2;
	}

}
