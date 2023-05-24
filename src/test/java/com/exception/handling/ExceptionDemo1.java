package com.exception.handling;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		
		try {
			int num1 =100;
			int num2 = 20;
			System.out.println(num1/num2); //100/0
		} catch (Exception e) {
			System.out.println("Caught an exception "+e);
		} 
		System.out.println("Division operation is completed");
		
		//Try block is used to store the code which will throw an error or chances of getting an error
		try {
			String empName = "KUmar";
			System.out.println(empName.toUpperCase());
		} catch (Exception e) {
			System.out.println("Caught an exception "+e);
		}
		
		//Optional block which is executed all the times whether you get excpetion or not
		finally {
			System.out.println("String operation is completed");
		}
	}

}
