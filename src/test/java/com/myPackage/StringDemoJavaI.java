package com.myPackage;

public class StringDemoJavaI {

	public static void main(String[] args) {
		String empName  = "John Miller"; //String data type
		
		//System.out.println(empName);
		
		int num1 = 100;
		int num2 = 200;
		System.out.println(num1 + num2); //300
		
		String firstName = "John";
		String lastName = "Miller";
		System.out.println(firstName + lastName);
		System.out.println(firstName + " " + lastName);
		
		System.out.println(num1 + firstName + lastName); //100JohnMiller
	}

}
