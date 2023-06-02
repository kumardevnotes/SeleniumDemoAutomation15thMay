package com.interfaces.demo;

public interface MyInterface {
	//interface starts with interface keyword
	// Interface can contain only method signatures but not method with body (Abstract methods only)
	//Abstract methods or methods without body
	//We do not use abstract keyword in interface, before its methods
	public void displaySalary();
	public int getEmpID();
	public void displayFullNameinUpperCase(String firstName, String lastName);

}
