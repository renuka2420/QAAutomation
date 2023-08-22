/* WJP to find factorial of a number using recursion*/

package hackathonJava;

import java.util.Scanner;

public class Q28 {
	static int factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));  
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("the input number");
		int number=sc.nextInt() ; 
		 long  fact = factorial(number);   
		  System.out.println("Factorial of "+number+" is: "+fact);  
sc.close();
	}

}
