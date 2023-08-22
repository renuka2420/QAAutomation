//Write a program that reads two strings from the user and checks whether
// are anagrams or not. 
//Anagrams are two strings that contain the same characters in a different order.



package Basics;

import java.util.*;

public class Anagram {
	
	
	public static void ana(String str1,String str2)	
	{
		String s1=str1.replaceAll("\\s", "");
		String s2=str2.replaceAll("\\s", "");
		
		System.out.println(s1);
		System.out.println(s2);
		
		boolean status=true;
		System.out.println(s2.length());
		System.out.println(s1.length());
		
		if(s1.length()!=s2.length()) 
		{
			
			status=false;	
		}else 
		{
			
		char c[]=	s1.toLowerCase().toCharArray();
		char c1[]=s2.toLowerCase().toCharArray();
		

		Arrays.sort(c1);
		//String s6=new String(c1);
		//System.out.println(s6);
		Arrays.sort(c);
		//String s7=new String(c);
		//System.out.println(s7);
	status=	Arrays.equals(c, c1);
		}
		if(status) 
		{
			
			System.out.println("anagrams");
			}
			else 
			{
				System.out.println("not anagrams");
			}
		
	}

	

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("the input string1");
		String str1="";
		System.out.println("the input string2");
		String str2="";
		if (sc.hasNext()) 
		{
			str1=sc.nextLine();
			str2=sc.nextLine();
			
		}
		
		ana(str1,str2);
	sc.close();
	}}
		
		
		
		
		
