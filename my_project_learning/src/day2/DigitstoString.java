

//convert digits to string 123 to onetwothree

package day2;
import java.util.*;

public class DigitstoString {
	
	
	static void printValue(char digit) {
		
		switch (digit)
		{
		
		case '0':
			System.out.print("Zero");
		break;
		case '1':
			System.out.print("One");
			break;
		case '2':
			System.out.print("Two");
			break;
		case '3':
			System.out.print("Three");
			break;
		case '4':
			System.out.print("Four");
			break;
		case '5':
			System.out.print("Five");
			break;
		case '6':
			System.out.print("Six");
			break;
		case '7':
			System.out.print("Seven");
			break;
		case '8':
			System.out.print("Eight");
			break;
		case '9':
			System.out.print("Nine");
			break;
		}
		
	}
	
	static void printWord(String N) {
		
		for(int i=0;i<N.length();i++) {
			
			printValue(N.charAt(i));
		}
		
	}

public static void main(String[] args) 
{
	Scanner s = new Scanner(System.in);
	System.out.println("Please enter the number");
	int number = s.nextInt();
	String N=Integer.toString(number);
	//String N=String.valueOf(i);
	
	printWord( N);
	s.close();
}
}
