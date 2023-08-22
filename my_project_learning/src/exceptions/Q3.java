
/*Write a program that reads a string from the user and converts it to 
 * uppercase. The program should catch any NullPointerExceptions that 
 * may occur and print an error message.
 */
package exceptions;

import java.util.Scanner;

public class Q3 {
	
	static void m1(String s) {
		
	try {
		
		if(s.isEmpty()) {
			throw new NullPointerException();
		}else {
			
		}
		System.out.println(s.toUpperCase());
		}
	catch(NullPointerException e) {
		
		System.out.println("cannot convert null to uppercase"+e);
	}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		
		String s=sc.nextLine();
		
		
		m1(s);
		
		sc.close();
	}

	
	}


