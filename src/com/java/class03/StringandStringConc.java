package com.java.class03;

import java.util.Scanner;

public class StringandStringConc {

	int num = 78456;
	int reverse = 0;
	while(num!=0)
	{
		int lastDigit = num % 10;
		num = num / 10;
		reverse = reverse * 10 + lastDigit;
	}System.out.println(reverse);
    }
}
