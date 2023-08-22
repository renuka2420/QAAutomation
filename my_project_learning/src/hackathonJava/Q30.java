
/*Write a function to find out longest palindrome in a given string?*/
package hackathonJava;
import java.util.*;


public class Q30 {

	    public static int longestPalSubstr(String str)
	    {
	       
	        //int n = str.length();
	    
	        // All subStrings of length 1
	        // are palindromes
	        int maxLength = 1;
	        		int start = 0;
	    
	        // Nested loop to mark start and end index
	        for (int i = 0; i < str.length(); i++) {
	            for (int j = i; j < str.length(); j++) {
	                int flag = 1;
	    
	                // Check palindrome
	                for (int k = 0; k < (j - i + 1) / 2; k++)
	                    if (str.charAt(i + k) != str.charAt(j - k))
	                        flag = 0;
	    
	                // Palindrome
	                if (flag!=0 && (j - i + 1) > maxLength) {
	                    start = i;
	                    maxLength = j - i + 1;
	                }
	            }
	        }
	    
	        // return length of LPS
	        return maxLength;
	    }
	    public static void main(String args[]) {

			Scanner sc=new Scanner(System.in);
			System.out.println("the input string");
			String s=sc.nextLine();
	        System.out.println(longestPalSubstr(s));
	        sc.close();
	    }
	}




