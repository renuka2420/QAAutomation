//remove a specific element from an array


package day4;

import java.util.Arrays;

public class Remove {

	public static void main(String[] args) {
		
		
		int  x [] ={1,2,3,4,5,6,7};
		int y []=new int[x.length-1];
		int j=3;
		
		for(int i=0,k=0;i<x.length;i++) {
			
			if(i!=j) {
				y[k]=x[i];
				k++;	
			}
			
			
			
		}		
		
		System.out.println("array elements"+Arrays.toString(x));
		System.out.println("array elements"+Arrays.toString(y));	

	}
}
