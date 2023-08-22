 /*WJP to find total number of integers, uppercase and lowercase


 character in the give string*/

package hackathonJava;

import java.util.Scanner;

public class Q17 {
	
	public static void intNum(String s) 
	{
		int countnum=0;
		for(int i=0;i<s.length();i++) 
		{if(s.charAt(i)>='0'&&s.charAt(i)<='9')
		{
			countnum++;
			
			
		}
			
		}
		System.out.println("the number of integers  in the given string are "+countnum);
	}
	public static void upper(String s) 
	{int upper=0;
		for(int i=0;i<s.length();i++)
		{if(s.charAt(i)>='A'&& s.charAt(i)<='Z')
		{
			upper++;
			
		}
		
		}
		System.out.println("the number of uppercase characters "
				+ "in the given string are "+upper);
		
	}
	public static void lower(String s) 
	{
		int lower=0;
		for(int i=0;i<s.length();i++)
		{if(s.charAt(i)>='a'&& s.charAt(i)<='z')
		{
			lower++;
			
		}
		
		}
		System.out.println("the number of lowercase "
				+ "characters in the given string are "+lower);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("the input string");
		String s=sc.nextLine();
		intNum(s) ;
		upper(s);
		lower(s);
		sc.close();

	}

}
