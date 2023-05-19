package com.controlstructures;

public class IfElseDemo {

	public static void main(String[] args) {

		char empGender = 'M';

		if (empGender == 'M') {  //  'M' == 'M' --> true
			System.out.println("You are a male");
		} else if (empGender == 'F') { // 'F' == 'F' --> true
			System.out.println("You are a female");
		}

		else
			System.out.println("You have entered incorrect gender");
	}

}
