package com.qa.main;

public class Division_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 78;
		int b = 0;

		Division_Exception de = new Division_Exception();

		de.divisionExceptions(a, b);

	}

	public static void divisionExceptions(int a, int b) {

//		Division_Exception dv = Division_Exception();

//		int c = a / b;

		try {
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException ae) {
			System.out.println("you tried to divide by 0");
		}

	}

}

//Division with Exceptions 
//
//
//
//Create a program that can take 2 ints and can produce 
//the division of these numbers.  You can use the Maths Project created earlier. 
//This method will need to catch 2 specific exceptions as well as an overall third exception. 
//
//
//
//
//Handle each of these exceptions within the method and handle them in different ways. 
//
//
//
//
//Recreate the Division method to throw your own bespoke exception.  
//This exception will be thrown if the user tries to divide a number (A) by a larger number (B). 
//
//
//
//Create a separate class that will be your Exception, this class will extend the Exception class. 
//
//
//
//Create and implement the Division method so that it takes account of your new exception. 
//
//
//
//Handle this exception