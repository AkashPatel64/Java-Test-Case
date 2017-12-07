package com.test;

public class Returnvalue_double {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=addition (20);
		System.out.println("a::"+a);
	//	subtraction (0);
		
	}
	public static double addition (double add)
	{
		double no1 = 30.30;
		System.out.println("Number 1 " + no1);
	//	double no2 = 20.20;
	//	System.out.println("Number 2 " + no2);
		double result = no1 + add;
		System.out.println("Addition " + result);

		return result;
	
	}
	public static double subtraction(double add)
	{
		double no1 = 20.50 - add;
		System.out.println("Subtraction " + no1);
		return add;
	}
}
