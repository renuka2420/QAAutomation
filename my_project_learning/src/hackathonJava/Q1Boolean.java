/*Consider there is a 3 Boolean variable called a, b, c. 

 * Check if at least two out of three Booleans are true
 */


package hackathonJava;

import java.util.Scanner;

public class Q1Boolean 
{
	
	
	public static void checkBoolean(boolean a,boolean b,boolean c)
	{
		if((a&&b)||(b&&c)||(c&&a)) 
		{
			System.out.println("at least two out of three Booleans are true");
			
		}else
			System.out.println("the condition is not satisfying");
	}
	

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("the input Boolean values are:");
		
		boolean a = false;
		boolean b = false;
		boolean c = false;
		try{
			 a=sc.nextBoolean();
		 b=sc.nextBoolean();
		 c=sc.nextBoolean();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		checkBoolean(a,b,c);
		
sc.close();
	}

}
