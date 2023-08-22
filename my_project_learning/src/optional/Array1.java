/*Given an array of integers, write a program to find the length of the

 *  longest increasing subsequence.
Example:
Input: [10, 9, 2, 5, 3, 7, 101, 18]

Output: 4

In this example, the longest increasing subsequence is
 [2, 3, 7, 18], which has a length of 4.

 */
package optional;

public class Array1 {
	
	public static void lengthofSubsequence(int arr[],int n) {
		
		
		for(int i=0;i<n;i++) 
		{
			System.out.println(arr[i]+" ");
			int temp=arr[i];
			int count=1;
			
			for(int j=i+1;j<n;j++)
			{  
				if(temp<arr[j]) {
					
					temp=arr[j];
					System.out.println(arr[j]+" ");
					count++;
					
					
				}
				
			}
			
			System.out.println("the length of the  subsequence is "+count);
			System.out.println();
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		int arr[] = { 10, 9, 2, 5, 3, 7, 101,18 };
        int n = arr.length;
        System.out.println("Length of given array is " +n);
        System.out.println();
        lengthofSubsequence(arr,n);
		

	}

}
