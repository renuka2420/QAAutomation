
/*WJP to differentiate input as string, int or bool*/
package hackathonJava;

import java.util.Scanner;

public class Q23 {

	public static boolean isInteger(String s) 
	
	{
		for(int i=0;i<s.length();i++) 
	if(Character.isDigit(s.charAt(i))==false) 
	{
		return false;
		
	}
		return true;	
		
	}
	public static boolean isBool(String s) 
	{
		if(s.equalsIgnoreCase("true")||s.equalsIgnoreCase("false")) 
		{
			return true;
		}
		return false;
	}
	public static boolean isString(String s) 
	{
		if(s.length()>1) 
		{
			
			return true;
			
		}
		return false;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("the input string");
		String s=sc.nextLine();
		
		System.out.println("the given string is Intger ? "+isInteger( s)); 
		System.out.println("the given string is boolean ? "+isBool( s));
		System.out.println("the given string is String ? "+isBool( s));
		sc.close();
	}

}
