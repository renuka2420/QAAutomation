/*Write a program that uses try-catch blocks to handle exceptions that
 *  may occur during arithmetic operations. The program should catch 
 *  any ArithmeticExceptions that may occur
 *  and print an error message.
 */


package exceptions;

public class Q1 {
	
	public static void m1() {
	int a=2;
	int b=0;
	
	try{
		int c=a/b;
		System.out.println(c);
	}catch(ArithmeticException e){
		System.out.println("can't divide by zero"+e);
	}
	
	System.out.println("remaining");
	}

	public static void main(String[] args) {
		m1();

	}

}
