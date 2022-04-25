package com.vojeda.calculadora;

import javax.jws.WebService;

@WebService(endpointInterface = "com.vojeda.calculadora.Operacion")
public class Operacionimpl implements Operacion {

	@Override
	public Integer suma(int a, int b) {
		return a + b;
	}

	@Override
	public Integer resta(int a, int b) {
		return a - b;
	}

	@Override
	public Integer division(int a, int b) {
		return a / b;
	}

	@Override
	public Integer multiplicacion(int a, int b) {
		return a * b;
	}
}
