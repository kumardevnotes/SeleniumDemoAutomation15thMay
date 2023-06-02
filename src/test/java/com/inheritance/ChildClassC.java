package com.inheritance;

public class ChildClassC extends ParentClass2{

	public static void main(String[] args) {
		
		ChildClassC obj = new ChildClassC();
		obj.displayCityName();
		
		//Below statement will work becoz displayCountryName() is protected and can be accessed in same package level
		//obj.displayCountryName()
		obj.displayCountryName();
		
		
		ParentClass2 parentObj = new ParentClass2();
		parentObj.displayCountryName();
		
	}

}
