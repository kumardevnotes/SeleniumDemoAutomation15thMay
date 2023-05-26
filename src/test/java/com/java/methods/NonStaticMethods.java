package com.java.methods;

public class NonStaticMethods {

	public static void main(String[] args) {
		//displayName(); // we can not call non-static method like this
		
		NonStaticMethods myObj = new NonStaticMethods(); //standard java statement to create a class object
		myObj.displayName();
		myObj.displayName("Kumar");
		int myInt = myObj.getSalary();
		System.out.println(myInt);
		
	}
	
	// Declaring a non-static method in java without parameter
	public  void displayName() {
		System.out.println("John Miller");
	}

	// Declaring a non-static method in java with string parameter
	public  void displayName(String empName) { //ABC
		System.out.println("Given empName is " + empName); //Given empName is ABC
	}

	// Declaring a non-static method in java with return type as int
	public  int getSalary() {
		return 200;
	}
	

}
