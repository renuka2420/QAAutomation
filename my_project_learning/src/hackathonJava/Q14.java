/*Given a string print the reverse of the words string.

 * (Input:  Java Code Output: Code Java)
 */

package hackathonJava;

public class Q14 {
	public static void reverseString(String s) 
	
	{
		String[] words=s.split(" ");
		int n=words.length;
		
		for (int i=n-1;i>=0;i--) 
		{
			System.out.print(words[i]+" ");
	
		}
	
		}

	public static void main(String[] args) {
		String s="Java Code";
		System.out.println("the given input string is: "+s);
		reverseString(s);

	}

}
