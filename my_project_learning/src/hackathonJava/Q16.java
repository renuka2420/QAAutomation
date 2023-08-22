/* Write a method that will remove given character from the String?*/

package hackathonJava;

import java.util.Scanner;

public class Q16 {

	public static void removerchar(String str,char c) 
	
	{
		String str1=str.replace(" ", "");
		int n=str1.length();
		
		System.out.println("the given String is "+str+""
				+ " length is "+n+" character is "+c);
		
		for(int i=0;i<n;i++) 
		{
			if(str1.charAt(i)!=c)
			{
				
				System.out.print(str1.charAt(i));
				
				
		}
	}
	}
	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		System.out.println("the input string");
		String str=sc.nextLine();
		System.out.println("the input character");
		char c=sc.next().charAt(0);
		
		removerchar(str,c);
		sc.close();

	}

}
