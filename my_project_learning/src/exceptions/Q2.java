/*Write a program that reads a string from the user and parses it into an 
 * integer. The program should catch any NumberFormatExceptions that may 
 * occur and print an error message.
 */

package exceptions;
import java.util.*;

public class Q2 {
	
	public static void m1(String s) {
		
	try {	 
		
		int number =Integer.parseInt(s);
		 System.out.println(number);
	}
	catch(NumberFormatException e) {
		System.out.println("parsing here is not possible"+e);
		System.out.println("in catch");
	}
	
	finally {
		System.out.println("in finally");
	}
	System.out.println("out of exception handling  blocks");
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s="";
		if(sc.hasNext()) {
			
			s=sc.nextLine();
		}
		
		m1(s);
		sc.close();
	}

}
