/*Given an array of integers, sort the integer values.*/


package hackathonJava;

import java.util.Arrays;

public class Q3ArrayIntSort {
	
	public static void BubbleSort(int Array[])
	{
		
		for(int i=0;i<Array.length;i++) 
		{
			for(int j=1;j<(Array.length)-i;j++)
			{
				int temp=0;
				if(Array[j]<Array[j-1]) 
				{
					temp=Array[j-1];
					Array[j-1]=Array[j];
					Array[j]=temp;	
					
				}
			}
		}
		System.out.println("the sorted array is: "+Arrays.toString(Array));
		
	}
	public static void sorting(int Array[]) 
	{
		Arrays.sort(Array);
		System.out.println("the sorted array is: ");
		System.out.println(Arrays.toString(Array));
		
	}
	public static void main(String[] args) {
		
		System.out.println("the input Array is:");
        int Array []= {3,5,1,65,43,56,46,45,34};
        System.out.println( Arrays.toString(Array)); 
        //sorting( Array) ;
        BubbleSort( Array);
	}

}
