package com.sprintqa.course;

public class DataTypes {
	
	static public void main (String[] args) {
		// Primitive Data Types:
		
		byte b  = 100; //-128 to 127
		//byte b1 = 1000; // will show error because it has exceeded memory capacity
		
		short s = 10000; //-32,768 to 32,767
		//short s1 = 40000; // will show error because it has exceeded memory capacity
		
		int i = 100000; //-2,147,483,648 to 2,147,483,647
		//int i1 = 3000000000;//will show error because it has exceeded memory capacity
		
		long l = 999999; //9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		//long l1 = 9,223,372,036,854,775,808;//will show error because it has exceeded memory capacity
		
		float f = 2.55f; //store up to 7 decimal digits
		
		double d = 3.5; // store up to 16 decimal digits
		
		char c = 'A';
		boolean isRaining = true;
		boolean sale = false;
		
		String text = "Words and senteces.";
		
		System.out.println("Primitive byte " +b);
		System.out.println("Primitive short " + s);
		System.out.println("Primitive int " + i);
		System.out.println("Primitive long "+ l);
		System.out.println("Primitive float " + f);
		System.out.println("Primitive double " +d);
		System.out.println("Primitive char " + c);
		System.out.println("Primitive boolean " + isRaining);
		System.out.println("Primitive boolean " + sale);
		System.out.println(10+2);
		
	
		
	}

}
