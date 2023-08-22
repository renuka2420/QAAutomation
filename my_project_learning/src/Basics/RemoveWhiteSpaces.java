
//Write a program that reads a string from the user and then removes all the white spaces from the string. 
//The program should then print the new string.

package Basics;

import java.util.Scanner;

public class RemoveWhiteSpaces {
	
	
	public static String removeSpaces(String str) {
		
		String s=str.replace(" ","");
		
		return s;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("the input string");
		String str=sc.nextLine();
		
System.out.println(removeSpaces(str));
sc.close();

	}

}
