/*Q15. Given a string print the unique words of the string.*/

package hackathonJava;

import java.util.Scanner;

public class Q15 {

	public static void uniqueWords(String str) {
		
		String[] words=str.split(" ");
		int n=words.length;
		
		for(int i=0;i<n;i++)
			
		{
			int count=1;
			for(int j=i+1;j<n;j++) 
		{
			if(words[i].equalsIgnoreCase(words[j]))
			
			{
				count++;
				words[j]="";
				
			}
			}
			if(count==1&&words[i]!="")
			
				System.out.println(words[i]);
			
			
		}
			
		}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("the input string");
		String str=sc.nextLine();
		uniqueWords(str);
		sc.close();
		

	}

}
