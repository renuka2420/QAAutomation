
/* Given a string print the reverse of the string.


 * (Input:  Java Code Output: edoC avaJ)
 */

package hackathonJava;

public class Q13 {
	public static void reverseString(String s) 
	{
		for (int i=s.length();i>0;i--) 
		{
			System.out.print(s.charAt(i-1));
	
		}
	
		}
		

	public static void main(String[] args) {
		String s="Java Code";
		System.out.println("the given input string is: "+s);
		reverseString(s);
		
	}

}
