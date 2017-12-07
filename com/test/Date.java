package com.test;



	import java.util.*;

	public class Date {

	   public Date(int i, int j, int k) {
			// TODO Auto-generated constructor stub
		}

	public static void main(String[] args) {

	   // create 2 dates
	   Date date = new Date(2011, 5, 21);
	   Date date2 = new Date(2015, 1, 21);

	   // tests if date 2 is after date and print
	   boolean after = date2.after(date);
	   System.out.println("Date 2 is after date: " + after);

	   // tests if date is after date 2 and print
	   after = date.after(date2);
	   System.out.println("Date is after date 2: " + after);
	   }

	private boolean after(Date date) {
		// TODO Auto-generated method stub
		return false;
	}
	}


