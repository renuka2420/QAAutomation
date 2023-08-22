//Write a program that reads a string from the user and then finds 
//the longest word in the string. The program should print the
//length of the longest word and the word itself.

package Basics;

import java.util.Scanner;

public class LongestWordLength {
	
	
	
	public static void longestWordLength(String str) {
		
		String[] words=str.split(" ");
		int maxlength=0;
		String longestword="";
		
		for (int i=0;i<words.length;i++) {
			
			if(words[i].length()>maxlength) {
				
				maxlength=words[i].length();
				longestword=words[i];
			}
			
			
		}
		System.out.println(maxlength);
		System.out.println(longestword);
		}
		
		/*for(String word:words) {
			if(length<word.length()) {
				
				length=word.length();
				System.out.println(word);
			}
			
		}
		return length;
		
	}*/

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("the input string is");
		String str="";
		if(sc.hasNext())
		{
			
			str=sc.nextLine();
			sc.close();
		}
		
		longestWordLength(str);
		

	}

}
