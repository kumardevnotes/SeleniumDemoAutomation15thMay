package com.myPackage;

public class StringDemoJavaII {

	public static void main(String[] args) {
		String empCity = "London"; //Lxndxn
		                 //empCity[0] = L
						 //empCity[1] = o
						 //empCity[2] = n
						 //empCity[3] = d
						 //empCity[4] = o
						 //empCity[5] = n --> length()-1 = 6-1=5
						 //empCity.length()  = 6
		
		System.out.println(empCity);
		
		System.out.println(empCity.toUpperCase()); //LONDON
		System.out.println(empCity.toLowerCase()); //london
		System.out.println(empCity.charAt(5)); //n
		
		System.out.println(empCity.length()); //6
		
		System.out.println(empCity.replace('o', 'x')); //Lxndxn
		System.out.println(empCity.concat("Newyork")); //LondonNewyork
		
		System.out.println(empCity.substring(4));
		
	   empCity = " London ";
		System.out.println(empCity);
		System.out.println(empCity.trim());
	}

}
