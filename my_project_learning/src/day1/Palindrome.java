//Write a program that reads a string from the user and checks whether 
//it is a palindrome or not.
//A palindrome is a string that reads the same backward as forward.


package day1;
import java.util.*;

public class Palindrome 
{
public static boolean palin(String str) {
	
	int i=0;
	int j=str.length()-1;
	
	while(i<j) {
		
		if(str.charAt(i)==str.charAt(j))
		{
			
			i++;
			j--;
			
		}
		return true;
	}
	
	return false;
}
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("the input string to check palindrome or not");
		String str="";
		if(sc.hasNext())
		{
			
			str=sc.nextLine();
		}
		System.out.println("the input given is palindrome? : "+palin(str));
		sc.close();
	}
	
}	
		
		
		
		
		
		
		
		
		
		
	/*		
	if(isPalindrome( input))
	{
		
		System.out.println(input+" this is a palindrome");
		
	}
	else 
	{
		
		System.out.println(input+" this is not a palindrome");
	}
	sc.close();
	}
		public static  boolean isPalindrome(String input) 
		{
			int i=0;
			int j=input.length()-1;	
		
		
		while(i<j) 
		{
			if(input.charAt(i)!=input.charAt(j))
			{
				
				return false;
				
			}
				
				i++;
				j--;
			
		}
		return true;
			
}
			
		}*/
		
		
		
