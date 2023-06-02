package com.inheritance;

public class ParentClass {
	
	public static void main(String[] args) {
		ParentClass parentClassObj = new ParentClass();
		parentClassObj.displaySchoolAnnualIncome();
	}

	public void displaySchoolName() {
		System.out.println("Little Flowers Kids School");
	}

	public void displaySchoolFee(int gradeNum) { //3
		switch (gradeNum) { //3
		case 1:
			System.out.println("1000 Pounds for Grade1");
			break;
		case 2:
			System.out.println("2000 Pounds for Grade2");
			break;
		case 3:
			System.out.println("3000 Pounds for Grade3");
			break;
		default:
			System.out.println("Sorry we teach till Grade3 only");
		}
	}
	
	//if you create any method as private as shown below, then only this class can access this method  but not its child classes
	private void displaySchoolAnnualIncome() {
		System.out.println("10000 pounds");
	}

}
