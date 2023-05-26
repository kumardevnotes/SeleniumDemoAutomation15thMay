package com.exception.handling;

public class ExcetionHandlingDemoII {

	public static void main(String[] args) {

		try {
			int num1 = 100;
			int num2 = 10;
			System.out.println(num1 / num2); // 100/10 --> 10

			String empName = null;
			System.out.println(empName.toUpperCase());
		} 
		catch (ArithmeticException e) {
			System.out.println("Caught an exception " + e);
		}

		catch (NullPointerException e) {
			System.out.println("Caught an exception " + e);
		}

	}

}
