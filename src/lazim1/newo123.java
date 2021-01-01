package lazim1;

import java.util.Scanner;

public class newo123 {

	public static void main(String[] args) {
	int student1 , student2, student3, student4, student5;
	double average;
	Scanner input = new Scanner (System.in);
	System.out.println("Enter score");
	student1 = input.nextInt();
	System.out.println("Enter score");
	student2 = input.nextInt();
	System.out.println("Enter score");
	student3 = input.nextInt();
	System.out.println("Enter score");
	student4 = input.nextInt();
	System.out.println("Enter score");
	student5 = input.nextInt();
	average =(student1 * 0.36) + (student2 * 0.35) +(student3 * 0.45) +(student4 * 0.43) + (student5 * 0.38);
	System.out.println(" The average is :" + average);
	
	
	}

}
