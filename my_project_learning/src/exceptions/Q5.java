/*Write a program that reads a string from the user and checks if it 
 * contains a specific substring. The program should catch any 
 * StringIndexOutOfBoundsExceptions that may occur and print
 *  an error message.
 */


package exceptions;

import java.util.Scanner;
public class Q5 {
	
	static void checkSubstring(String s) {
		
		try {
			s.substring(2, 10);
		}
		catch(StringIndexOutOfBoundsException e) {
			
			System.out.println("more than string length"+e);
		}
	finally {
		System.out.println("check string length");
		
	}}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s="";
		if(sc.hasNext()) {
			
			s=sc.nextLine();
		}
		
		checkSubstring( s);
		
		sc.close();
	}}
