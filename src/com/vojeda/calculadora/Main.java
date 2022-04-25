package com.vojeda.calculadora;

import javax.xml.ws.Endpoint;


public class Main {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:1516/WS/Calculadora", new Operacionimpl());
	}

}
