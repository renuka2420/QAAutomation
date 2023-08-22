/*Write a program that reads a string from the user and then checks 

 it contains only digits or not. The program should print "true" if 
the string contains only digits and "false" otherwise.*/


package Basics;

import java.util.Scanner;

public class StringOnlyDigits {
	
	public static boolean allDigits(String str,int n) {
		
		for(int i=0;i<n;i++) {
			
			
			if(str.charAt(i)<'0'||str.charAt(i)>'9') {
				
				return false;
			}
		}
		
		return true;
	}
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("the input string");
		String str="";
		if(sc.hasNext()) {
			str=sc.nextLine();
		}
		
	int n	=str.length();
	
	System.out.println(allDigits( str, n));
	sc.close();

	}

}
