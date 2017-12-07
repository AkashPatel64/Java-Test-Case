package com.test;

public class AllOperation {

	public static void main(String[] args) {
		divison ();
		add ();
		sub ();	
		}
		public static void divison () {
			int no1 = 10;
			int no2 = 2;
			int div = no1 / no2;
			System.out.println("Divison ="+ div);
					
		}

		private static void add () {
			int no1 = 10;
			int no2 = 20;
			int add = no1 + no2;
			System.out.println("Addition ="+ add);
			
		}
		
		public static void sub () {
			 int no1 = 10;
			 int no2 = 5;
			 int sub = no1 + no2 ;
			 System.out.println("Subtraction = "+ sub);
		}
		
		public static void multipily () {
			
			int no1 = 10;
			int no2 = 20;
			int mul = no1 * no2;
			System.out.println("Multiplication = "+ mul );
			
		}
	}




