package com.java.methods;

public class StaticMethodsDemo {

	public static void main(String[] args) {
		System.out.println("I am a main()");
		
		//Calling static methods
		displayName();
		
		displayName("Kumar");
		
		int myInt  = getSalary();
		System.out.println(myInt);
		
		String myString  = getEmpName();
		System.out.println(myString);
		
		
		boolean myBoolean  = isMarried();
		System.out.println(myBoolean);
	}
	
	//Using same method name is called "Method overloading" in Java ex: displayName()

	// Declaring a static method in java without parameter
	public static void displayName() {
		System.out.println("John Miller");
	}

	// Declaring a static method in java with string parameter
	public static void displayName(String empName) { //ABC
		System.out.println("Given empName is " + empName); //Given empName is ABC
	}

	// Declaring a static method in java with return type as int
	public static int getSalary() {
		return 200;
	}
	
	// Declaring a static method in java with return type as int
	public static String getEmpName() {
		return "Kumar";
	}
	
	// Declaring a static method in java with return type as int
	public static boolean isMarried() {
		return false;
	}

}
