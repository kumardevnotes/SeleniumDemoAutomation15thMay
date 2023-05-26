package com.constructor.demo;

public class JavaConstructor {
	
	//Constructor in java is a method and its name is same as class name
	//Below is default constructor without parameters
	
	JavaConstructor(){
		System.out.println("I am default constructor");
	}
	
	//Parameterized constructor with String parameter
	JavaConstructor(String message){
		System.out.println("I am parameterized constructor with message: "+message);
	}
	
	public static void main(String[] args) {
		JavaConstructor myObj =  new JavaConstructor();
		myObj.displayName();
		myObj.displayName("Kumar");
		int myData  = myObj.getSalary();
		System.out.println(myData);
		
		//creating new object to invoke String parameterized constructor (Line 13) as shown below
		JavaConstructor myObj2 =  new JavaConstructor("Hello World");
		myObj2.displayName();
		myObj2.displayName("Irene");
		int myIntData = myObj2.getSalary();
		System.out.println(myIntData);
	}
	// Declaring a non-static method in java without parameter
	public void displayName() {
		System.out.println("John Miller");
	}
	// Declaring a non-static method in java with string parameter
	public void displayName(String empName) { // ABC
		System.out.println("Given empName is " + empName); // Given empName is ABC
	}

	// Declaring a non-static method in java with return type as int
	public int getSalary() {
		return 200;
	}

}
