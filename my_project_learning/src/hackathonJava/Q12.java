
/*Write a program to check palindrome (MalayalaM) for both numbers and string?*/
package hackathonJava;

import java.util.Scanner;

public class Q12 {
	
	
	public static boolean palinString(String str) 
	{
		
		int i=0;
		int n=str.length();
		while(i<n)
		{
			if(str.charAt(i)!=str.charAt(n-1))
			{
				return false;
				
			}
			i++;
			n--;
		}
				
		return true	;	
	}
	public static void palinNum(long num) 
	{
		
		long r;
		long sum=0;
		long temp=num;
		
		while(num>0)
		{
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;		
	}
		if(temp==sum)    
	        System.out.println("It is a Palindrome number.");    
	      else    
	        System.out.println("Not a palindrome");    
	     } 
	

	public static void main(String[] args)
	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("the input string");
		String str=sc.nextLine();
		System.out.println("the input number");
		long num=sc.nextLong();
		System.out.println("the given strimg is palindrome ? "+palinString( str)); 
		palinNum( num); 
		sc.close();

	}

}
