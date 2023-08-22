//find the index of an array element

package day4;

public class IndexofanArray {

	public static void main(String[] args) {
		
int[] x= {1,5,76,89,44,55,66,22,11,14,14134};
int item=890;
int index=-1;


for(int i=0;i<x.length;i++) {
	
	if(x[i]==item) {
		
		index=i;
		break;	
		
	}	
		
	}	

System.out.println("element found at index"+index);
}
}
					

