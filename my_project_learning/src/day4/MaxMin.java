//find the maximum and minimum value of the array

package day4;

public class MaxMin {
	
	
	public int max(int[] arr) {
		int max=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {
				max=arr[i];
			}
		
		}
		return max;
		
	}
	public int min(int[] arr) {
		
	int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			
		}
		return min;
	}
	public static void main(String[] args) {
		int[] x= {31,-62,37,56,80,65,89,44,34};
		MaxMin obj=new MaxMin() ;
		
	System.out.println(	obj.max(x));
	System.out.println(	obj.min(x));	
		
		
		

	}

}
