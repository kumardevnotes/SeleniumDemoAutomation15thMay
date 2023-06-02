package com.inheritance;

public class ChildClassA extends ParentClass { 
	
	final static int empName =1122;

	public static void main(String[] args) {
		
		System.out.println(empName);
		
		//below statement will throw an error as empName is a final variable.
		//And you can not assign a new value to it
		//empName=  445555;
		
		ChildClassA childClassOj = new ChildClassA();
		childClassOj.displaySchoolAddress();
		childClassOj.displaySchoolStartDate();
		
		childClassOj.displaySchoolFee(2);
		
		childClassOj.displaySchoolName(); // Little Flowers Kids School - which is coming from parent class displaySchooName()
		
		childClassOj.displayName();
		childClassOj.displayName("Kumar");
		
		//Private method can not be called in Child class scope
		//childClassOj.displaySchoolAnnualIncome();
		
	}
	
	//Object oriented program  - Dynamic polymorphism or method overriding
	public void displaySchoolName() {
		System.out.println("Model School");
	}
	

	// declaring a method
	public void displaySchoolAddress() {
		System.out.println("Gunnersbury House , 1 Chapel Hill, London, A11 B12");
	}

	public void displaySchoolStartDate() {
		System.out.println("September 1st, 2023");
	}
	
	// Object oriented concept in java
	//static polymorphism or method overloading in java -  i.e, having same method name but with different parameters
	//Declaring a non-static method displayName()
	public void displayName() {
		System.out.println("John Miller");
	}
	
	//Declaring a non-static method displayName(String stdName)
	public void displayName(String stdName) {
		System.out.println("stdName passed to this method is: "+stdName);
	}

}
