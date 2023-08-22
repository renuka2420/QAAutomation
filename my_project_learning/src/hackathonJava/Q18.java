//*WJP to display duplicate character in string*/

package hackathonJava;

import java.util.Scanner;

public class Q18 {
	
	public static void duplicate(String s) 
	{
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++) 
			{
				if(s.charAt(i)==s.charAt(j))
				{System.out.print(s.charAt(j)+" ");
					break;
				}
				
			}
			
		}
		
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("the input string");
		String s=sc.nextLine();
		duplicate( s) ;
		sc.close();
		

	}

}
