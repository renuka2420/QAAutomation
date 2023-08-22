/*Given an array of integers check the Palindrome of the series.*/

package hackathonJava;

public class Q4Palindrome {

	public static boolean Palin(int[] a) 
	
	{
		int i=0;
		int n=a.length;
		
		while(i<n)
		{
			
			if(a[i]!=a[n-1])
			

			{
				
				return false;	
			}
			i++;
			n--;
			}
		return true;
	
		
		
	}
	public static void main(String[] args) {
		int a[]= {3,4,5,4,3};
		int a1[]= {4,5,6,8,3,4,8};
		Palin(a);
		Palin( a1);
		System.out.println("the given array is palindrome ? " +Palin(a));
		System.out.println("the given array is palindrome ? " +Palin(a1));

	}

}
