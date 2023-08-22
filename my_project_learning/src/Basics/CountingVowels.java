//Write a program that reads a string from the user and then counts the number of vowels in the string. 
//The program should print the number of vowels.

package Basics;

//import java.util.ArrayList;
import java.util.Scanner;

public class CountingVowels {
	
/*	
	ArrayList<Character> al;
	
	CountingVowels(){
	al	=new ArrayList<Character>();
			
		
		al.add('a');al.add('e');al.add('i');al.add('o');al.add('u');
		al.add('A');al.add('E');al.add('I');al.add('O');al.add('U');
		
		
	}

	private boolean isVowel(char ch) {
		
		for(int i=0;i<al.size();i++) {
			
			if(ch==al.get(i)) {
				return true;
				
			}}
		return false;	
		
	}
	
	
	public int countVowel(String str) {
		int countvowel=0;
		int s=str.length();
		
		for(int j=0;j<s;j++) {
			char ch=str.charAt(j);
			
			if(isVowel(ch)) {
				
				countvowel=countvowel+1;
				
			}
		}
				
		return 		countvowel;
		
	}


	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("the input string");
		String str=sc.nextLine();
		
		CountingVowels ob=new CountingVowels();
		
		
		int numberOfVowels =ob.countVowel(str);
		System.out.println(numberOfVowels);
		sc.close();
	}
*/
	public static void vowels(String str) {
		int s=str.length();
		str=str.toLowerCase();
		int count=0;
		for(int i=0;i<s;i++) {
			
			
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'
					||str.charAt(i)=='o'||str.charAt(i)=='u') {
				
				
				count++;
				
				
			}
		}
		System.out.println("the vowels are"+count);
	}
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("the input string");
		String str=sc.nextLine();
		vowels(str);
		sc.close();
		
}
}