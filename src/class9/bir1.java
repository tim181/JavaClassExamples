package class9;

import java.util.Scanner;

public class bir1 {
public static void main (String[] args)
{
	// Step 1 - declare the known & unknown variables
	char grade;
	String message;
	
	// Step 2-3 - initialize the known/uknown variables
	Scanner scanner = new Scanner (System.in);
	System.out.println ("Enter your grade:");
	grade = scanner.next ().charAt (0);
	System.out.println (grade);
	scanner.close ();
	
	// step 4 - implement your code logic
	switch (grade)
	{
		case 'A':
			message = "Excellent Job!";
			break;
		case 'B':
			message = "Great Job!";
			break;
		case 'C':
			message = "Good Job!";
			break;
		case 'D':
			message = "You need to work a bit harder!";
			break;
		case 'F':
			message = "Try again!";
			break;
		default:
			message = "Error. Invalid grade";
	
	}
	
	// step 5 - output the program
	System.out.println (message);	
}
}