/**
 * Operacion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vojeda.calculadora;

import javax.jws.WebService;

@WebService
public interface Operacion extends java.rmi.Remote {
    public java.lang.Integer suma(int arg0, int arg1) throws java.rmi.RemoteException, com.vojeda.calculadora.Exception;
    public java.lang.Integer resta(int arg0, int arg1) throws java.rmi.RemoteException, com.vojeda.calculadora.Exception;
    public java.lang.Integer division(int arg0, int arg1) throws java.rmi.RemoteException, com.vojeda.calculadora.Exception;
    public java.lang.Integer multiplicacion(int arg0, int arg1) throws java.rmi.RemoteException, com.vojeda.calculadora.Exception;
}
