package com.controlstructures;

public class ForLoopDemo {

	public static void main(String[] args) {
		
		//forloop is used to execute same statement 'n' number of times based on some condition
		
		System.out.println("Below output is for first forloop");
     		//Declaration; condition; increment/decrement
		for (int i = 0; i < 5; i++) { // 5 ; 5 < 5 --> false
			System.out.println("Hello All "+i);
		}
		System.out.println("I am outside for loop");
		
		System.out.println("Below output is for second forloop");
		//Declaration; condition; decrement
		for (int i = 5; i > 0; i--) { // 0 ; 0 > 0
			System.out.println("Hello All "+i);
		}
		System.out.println("I am outside for loop");
		
		System.out.println("Below output is for third forloop");
		System.out.println("break statement will terminate rest of the forloop completley");
		//Declaration; condition; increment
		for (int i = 0; i < 5; i++) { // 2 ; 2 < 5
			if(i == 2) { // 2 == 2 --> true
				break;
			}
			System.out.println("Hello All "+i);
		}
		System.out.println("I am outside for loop");
		
		System.out.println("Below output is for fourth forloop");
		System.out.println("continue statement will skip only that particular iteration and execute remaining iterations");
		//Declaration; condition; increment
		for (int i = 0; i < 5; i++) { // 3 ; 3 < 5
			if(i == 2) { // 3 == 2 --> true
				continue;
			}
			System.out.println("Hello All "+i);
		}
		System.out.println("I am outside for loop");
		
		
	}

}
