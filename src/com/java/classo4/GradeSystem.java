/**
 * 
 */
package com.java.classo4;

import java.util.Scanner;


public class GradeSystem {

		public static void main(String[] args) {
			
			Scanner scan =new Scanner(System.in);
		    int num1 = 10, num2 = 20;
		    String c = "Add";
		    		
		    		switch (c) {
		    		
		    		case "Add":
		        System.out.println(num1 + num2);
		        break;
		        
		    
		    		case "Sub":
		    	        System.out.println(num1 - num2);
		    	        break;
		    	        
		    		case "Mul":
		    	        System.out.println(num1 * num2);
		    	        break;
		    		case "Div":
		    			
		    			default:
		    	        System.out.println("Error");
		    	     
		        }
		      }
		    }
		    
		