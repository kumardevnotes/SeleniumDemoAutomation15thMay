package com.interfaces.demo;

public abstract class MyAbstractClass {
	
	/* Abstract class starts with 'abstract' keyword
	 * Abstract class can contain abstract methods (methods without body) and concrete methods (Methods with body)
	 * You have to use abstract keyword before each abstract method
	 * We can not create object of abstract class. Only its child class of abstract class can create object*/
	
	public void displaySalary() {
		System.out.println(3000);
	}
	
	public abstract int getEmpID();
	public abstract void displayFullNameinUpperCase(String firstName, String lastName);

}
