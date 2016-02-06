package com.java.ws.secure.container;

import javax.jws.WebService;

@WebService
public interface CalculatorIfc {

	public int add(int num1,int num2);
	public int sub(int num1,int num2);
	public int multiply(int num1, int num2);
	public float divide(int num1,int num2);
}