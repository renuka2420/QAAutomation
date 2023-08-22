//Write a program that reads a string from the user and then converts it 
//to title case. Title case means that the first letter of each word in the string is capitalized.



package Basics;

import java.util.Scanner;

public class StringTitle {
	
	
	public static String titleCase(String str) {
		
		String[] words=str.split("\\s");
		String titlecase="";
		
		for(String word:words) {
			
		String first	=word.substring(0, 1);
		String afterfirst=word.substring(1);
		titlecase=titlecase+first.toUpperCase()+afterfirst+" ";
		}
		return titlecase;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("the input string");
		String str=sc.nextLine();
		
System.out.println(titleCase(str));
sc.close();
	}

}
