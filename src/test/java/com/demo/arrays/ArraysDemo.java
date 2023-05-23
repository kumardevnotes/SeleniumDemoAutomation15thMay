package com.demo.arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		/*
		 * A variable in java can store only one value at a time. If you assign a new
		 * value to the variable, the old value is vanished and new value is added to it
		 */

		int empID = 1122; // Integer
		//System.out.println(empID);

		empID = 3344;
		//System.out.println(empID);

		/* Arrays can store multiple values into a single variable 
		 * Arrays can store only same data type values or homogeneous data*/

		int empIds[] = { 1122, 3334, 4444, 5555, 6655 };
		//boolean myboolenData = {true, false, false, true, false];
		
		System.out.println(empIds[0]); // Printing the first array element whose index is 0 inthe array
		System.out.println(empIds[1]);
		System.out.println(empIds[2]);
		System.out.println(empIds[3]);
		System.out.println(empIds[empIds.length-1]); //5-1== 4
		
		System.out.println(empIds.length); //5
		
		String empCities[] = {"Pune" ,"Rome" ,"London", "Newyork", "Pune1" ,"Rome1" ,"London1", "Newyork1"};
		
		for (int i = 0; i < empCities.length; i++) { //8 ; 8 < 8
			System.out.println(empCities[i]); //empCities[1]
		}
		
		//Assignment1: Create boolean array and print values using forloop
		//Assignment2: Create char array and print values using forloop

	}

}
