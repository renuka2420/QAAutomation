//reverse word in a string
package day2;
import java.util.*;

public class ReverseWordString {
	
	
	public static void wordReverse(String s)
	{
		
	String words[]=	s.split(" ");
	String reversestring="";
	
	for(int i=0;i<words.length;i++) 
	{
		String word=words[i];
		String reverseword="";
		for(int j=word.length()-1;j>=0;j--)
		{
			
			reverseword = reverseword + word.charAt(j);
		}
		
		reversestring = reversestring + reverseword + " ";
		
	}
	   System.out.println("The given String is :  "+s);
       
       System.out.println("The Reversed String is:   "+reversestring);
	}

	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("give the string name");
	String s=sc.nextLine();
	
	wordReverse(s);
	sc.close();

}}


