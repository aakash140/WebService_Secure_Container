package com.java.ws.secure.container;

import javax.jws.WebService;

@WebService(endpointInterface="com.java.ws.secure.container.CalculatorIfc")
public class Calculator implements CalculatorIfc {

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}

	@Override
	public int sub(int num1, int num2) {
		// TODO Auto-generated method stub
		return num2-num1;
	}

	@Override
	public int multiply(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}

	@Override
	public float divide(int num1, int num2) throws ArithmeticException{
		// TODO Auto-generated method stub
		return num2/num1;
	}
}