package com.interfaces.demo;

import com.inheritance.ParentClass2;

public class MyClass2{

	public static void main(String[] args) {
		
		ParentClass2 obj = new ParentClass2();
		//Below statement will throw error becoz displayCountryName() is protected and can be accessed in same package level
		//obj.displayCountryName()
		
	}

}
