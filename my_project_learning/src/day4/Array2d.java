package day4;

public class Array2d {

	public static void main(String[] args) {
		int a[] []= {{1,2,3},{3,4,5}};
		int b[] []= {{1,5,3},{3,9,5}};
		System.out.println("Array A is :");
		
		for(int i=0;i<2;i++) {
			for (int j=0;j<3;j++) {
				
				
				System.out.print(" "+ a[i][j]);
			}
			
			System.out.println();
			
		}

	System.out.println("Array b is :");
		
		for(int i=0;i<2;i++) {
			for (int j=0;j<3;j++) {
				
				
				System.out.print(" "+ b[i][j]);
			}
			
			System.out.println();
			
		}

		
		
		
		
	}
	
	

}
