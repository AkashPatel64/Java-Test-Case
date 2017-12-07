package com.test;

public class InputParamethod {

	public static void main(String[] args) {
		divison (5);
		add (5);
		sub (5);	
		multipily (2);
		
		}
		public static void divison (int divisor) {
			int no1 = 10;
			int result = no1/divisor;
		
			System.out.println("Divison ="+ result);
					
		}

		public static void add (int additional) {
			int no1 = 10;
			int result = no1+additional;
			System.out.println("Addition ="+ result);
			
		}
		
		public static void sub (int subvalue) {
			 int no1 = 10;
			 int result = no1 - subvalue ;
			 System.out.println("Subtraction = "+ result);
		}
		
		public static void multipily (int multiplyno) {
			
			int no1 = 10;
			int mul = no1 * multiplyno;
			System.out.println("Multiplication = "+ mul );
			
		}
}


