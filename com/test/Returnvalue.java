package com.test;

public class Returnvalue {

	public static void main(String[] args) {
		divison (5);
		add (5);
		sub (5);
		multipily (5);
		}
		public static void divison (int divisor) {
			int no1 = sub (5);
			int result = no1/divisor;
		
			System.out.println("Divison ="+ result);
					
		}

		public static int add (int additional) {
			int no1 = 10;
			int result = no1+additional;
			System.out.println("Addition ="+ result);
			
			return result;
		}
		
		public static int sub (int subvalue) {
			 int no1 = add (5);
			 int result = no1 - subvalue ;
			 System.out.println("Subtraction = "+ result);

			 return result;
			 
		}
		
		public static int multipily (int multiplyno) {
			
			int no1 = add (5);
			int mul = no1 * multiplyno;
			System.out.println("Multiplication = "+ mul );
		
			return mul;
		}
}
