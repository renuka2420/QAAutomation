package day4;

public class BubbleSort {
	
	
	
	static void bubblesort(int[] arr) {
		
		int temp=0;
		
		for(int i=0;i<=arr.length;i++) {
			for(int j=1;j<(arr.length)-i;j++) {
			
			
			if(arr[j-1]>arr[j]) {
				
				temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
				
			}
			}}
		
	}

	public static void main(String[] args) {
		
		
		int arr[]= {3,5,1,2,7,8,34,23,56,65};
		
		System.out.println("Array before sorting");
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		bubblesort(arr);
System.out.println("Array after sorting");
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}

	}

}
