package com.interfaces.demo;

public class MyClass1 implements MyInterface {

	public static void main(String[] args) {
		MyClass1 obj = new MyClass1();
		obj.displaySalary();
		int myInt  = obj.getEmpID();
		System.out.println(myInt);
		obj.displayFullNameinUpperCase("john", "miller");
	}

	@Override
	public void displaySalary() {
		System.out.println(2000);
	}

	@Override
	public int getEmpID() {
		return 1122;
	}

	@Override
	public void displayFullNameinUpperCase(String firstName, String lastName) {
		System.out.println(firstName.toUpperCase() + " " + lastName.toUpperCase());
	}

}
