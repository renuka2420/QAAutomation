
/*write a program to find factorial (Non Recursive)*/

package hackathonJava;

import java.util.Scanner;

public class Q2Factorial {
	
	
	public static void factrial(int n) 
	{
		int i=1;
		int fact=1;
		while(i<=n) {
			
			fact=fact*i;
			i++;
			
		}
		System.out.println("The factorial of the number "+n+" is "+fact);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("the input number is: ");
		int n=0;
		if(sc.hasNext())
		{
			n=sc.nextInt();
		}
		factrial(n);
sc.close();
	}

}
