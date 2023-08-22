//find the average of all the elements in an array

package day4;

public class AvereageArray {

	public static void main(String[] args) {
		
		int x[]= {2,3,4,56,7};
		int sum=0;
		float f;
		
		for(int i=0;i<x.length;i++) {
			
			sum=sum+x[i];
			
			
			
		}
		System.out.println(sum);
		
		f=sum/2;
		System.out.println(f);
		
	}

}
