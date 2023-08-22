/*WJP to convert string to int*/

package hackathonJava;

import java.util.Scanner;

public class Q21 {

	
	public static void convertStringToInt(String str)
	{try {
		
		int i=Integer.parseInt(str); 
		System.out.println(i);
		}
	catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("the input string");
		String str=sc.nextLine();
		
		convertStringToInt( str);
		//int i1=Integer.valueOf(str);
		
		//System.out.println(i1);
		
		sc.close();
	}

}
