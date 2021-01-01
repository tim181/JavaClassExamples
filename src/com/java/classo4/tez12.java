package com.java.classo4;

public class tez12 {
	public static void main (String[]args) {
	int num = 784;
	int reverse =0, lastDigit;

	while(num!=0) {
		
		lastDigit = num %10;
		reverse = reverse *10+ lastDigit;
		System.out.println(reverse);
		char[] originalNum;
		System.out.println(originalNum);
		
		num = num/10;
		if(reverse == originalNum) {
	}System.out.println("Palindrone");
	}else {
		System.out.println("It is not Palindrone");
	}
}

}
