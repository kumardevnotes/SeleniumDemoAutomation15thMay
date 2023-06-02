package com.inheritance;

//Inheritance in java
public class ChildClassB extends ParentClass{
	
	public static void main(String[] args) {
		ChildClassB classBObj = new ChildClassB();
		classBObj.displaySchoolFee(1);
		classBObj.displaySchoolName();
	}
	
	public void displaySchoolAddress() {
		System.out.println("White building , Night Hill, London,P1 Y66");
	}
	
    public void displaySchoolStartDate() {
		System.out.println("October 1st, 2023");
	}
}
