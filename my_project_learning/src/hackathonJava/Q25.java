/*Write a program for binary search. And 5 i/p has to take 


 * from user as binary elements.
 */

package hackathonJava;

import java.util.Arrays;
import java.util.Scanner;

public class Q25 {
	
	public static void binarySearch(int[] Arr,int key) 
	{
		Arrays.sort(Arr);
		System.out.println("the sorted array is "+Arrays.toString(Arr));
		
	int res=Arrays.binarySearch(Arr,key);
	if(res>0) 
	
		
	System.out.println(key +" :the key element found at index "+res);
		
	else
		System.out.println("not found");
	
	
	
	}
		
	

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int[] Arr=new int[6];
	System.out.println("enter "+ 6 +" int values");
	
	
	for (int i=0;i<6;i++) 
	{
		Arr[i]=sc.nextInt();
		
	}
	System.out.println(Arrays.toString(Arr));
	System.out.println("enter the key element: ");
	int key=sc.nextInt();
	System.out.println("the key element is "+key);
	
	binarySearch(Arr, key) ;
	sc.close();
	
	}

}
