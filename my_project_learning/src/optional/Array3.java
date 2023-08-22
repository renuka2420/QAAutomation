
/*Write Java Program to move zeros in given array to end of the array


iInput: [1,2,0,5,0,6,3,0,7] output: [1,2,5,6,3,7,0,0,0]*/

package optional;

public class Array3 {
	
public static  void swap(int Array[],int l) {
	
	int j=0;
	int temp=0;
		
		for(int i=0;i<l;i++) 
		{
				if(Array[i]!=0) 
				{
				temp=Array[i];
				Array[i]=Array[j];
				Array[j]=temp;
				j++;
				
					
				}
				
			}
		System.out.println("the updated array is");
		for(int i=0;i<l;i++) {
			
			System.out.print(Array[i]+" ");
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		int Array []= {1,2,0,5,0,6,3,0,7};
		System.out.println("the original array is ");
		
		for(int i=0;i<Array.length;i++) {
			System.out.print(Array[i]+" ");
			
			
		}
		System.out.println();
	int l=	Array.length;
	swap(Array,l);
		
	}
	
	
	
}

