//Write a program that reads a string from the user and 
//then replaces all the vowels in the string with the letter 'x'.
//The program should then print the new string.


package Basics;

import java.util.Scanner;

public class ReplaceVowelString {
	
	
	public static String validate(String str,char ch) {
		
		return str.replaceAll("[aeiouAEIOU]",""+ ch);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("the input string");
		String str=sc.nextLine();
		
		System.out.println("the original string:"+str);
		
		
		System.out.println("after replacing vowels with 'x':"+validate(str,'x'));	
sc.close();
	}

}
