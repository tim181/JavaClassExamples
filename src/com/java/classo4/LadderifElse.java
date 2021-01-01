package com.java.classo4;

public class LadderifElse {

	public static void main(String[] args) {
		int num = 34545;
		
		int lastDigit;
		while (num !=0) {
		lastDigit = num % 10;
		
		System.out.println(lastDigit);
		num = num / 10;
		}
	}
	}
