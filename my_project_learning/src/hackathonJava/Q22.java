/*WJP to convert int to string*/

package hackathonJava;

import java.util.Scanner;

public class Q22 {
	
	public static void convertIntToString(int i)
	{
		
		String s=String.valueOf(i);
		System.out.println(s);
		
	
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("the input number");
	int i=sc.nextInt();
		
		convertIntToString( i);
String s1=Integer.toString(i);
System.out.println(s1);
sc.close();

	}

}
