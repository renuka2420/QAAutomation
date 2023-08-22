
/*WJP to perform ascending order Selection  sort*/
package hackathonJava;
 

public class Q6 {
public static void selectionSort(int arr[]) {
	
	int size=arr.length;
	int temp;
	
	  System.out.print("Sorting Array using Selection Sort Technique..\n");  
	     for(int i=0; i<size; i++)  
	     {  
	         for(int j=i+1; j<size; j++)  
	         {  
	             if(arr[i] > arr[j])  
	             {  
	                 temp = arr[i];  
	                 arr[i] = arr[j];  
	                 arr[j] = temp;  
	             }  
	         }  
	     }  
	    
	     System.out.print("Now the Array after Sorting is :\n");  
	     for(int i=0; i<size; i++)  
	     {  
	         System.out.print(arr[i]+ "  ");  
	     }  
	 
	
	
	
}
	public static void main(String[] args)
	{
		int arr[]= {3,6,2,1,43,23,56};
	     
	    
	     selectionSort(arr);

	}

}
 