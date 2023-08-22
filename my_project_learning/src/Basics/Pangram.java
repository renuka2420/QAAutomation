//Write a program that reads a string from the user and then checks whether it is a pangram or not. 
//A pangram is a string that contains all the letters of the alphabet.


package Basics;

import java.util.Scanner;
public class Pangram
{

public static void containsAllLetters(String str) 
{
	
 str=str.toLowerCase();
 boolean allLetterPresent = true;
	
	for(char ch='a';ch<='z';ch++) 
	{
		
		
		if(!str.contains(String.valueOf(ch)))
		{
			
			allLetterPresent=false;
			break;
			
		}
		
	}
	if(allLetterPresent)
	{
		System.out.println("Pangram String");  
	}else
		System.out.println("not Pangram String");  
}



	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("the input string");
		String str=sc.nextLine();
		
		containsAllLetters(str);
		sc.close();
	}

}
