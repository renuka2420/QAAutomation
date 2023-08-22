//find first big,second big and third biggest nymber

package Basics;
import java.util.*;
public class FirstSecondThirdBigNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number");
		int x=sc.nextInt();
		
		System.out.println("Enter second number");
		int y=sc.nextInt();
		
		System.out.println("Enter third number");
		int z=sc.nextInt();
//first largest number		
/*int Firstlargest=third>(first>second?first:second)?third:((first>second)?first:second);
System.out.println("the first largesr number is:"+Firstlargest);*/
		
		int first = 0, second = 0, third = 0;
		
		if((x<y)&&(x<z)) 
		{
			first=x;	
				if(y<z)
				{
					second =y;third=z;
				}
					else 
					{
						second =z;third=y;	
					}
		}
		else if((y<x)&&(y<z))
		{
			
			first=y;
			if(x<z) {
				
				second=x;third=z;
			}
			else 
			{
				second=z;third=x;
			}
		}
	
		else if((z<y)&&(z<x)) 
		{
			first=z;
			if(y<x) 
			{
				
				second=y;third=x;
				}
			else {
				second=x;third=y;
				
			}
		}
		System.out.println("the smallest number is "+ first);
		System.out.println("the second smallest number is "+ second);
		System.out.println("the larget number is "+ third);
		
		
sc.close();

	}

}
