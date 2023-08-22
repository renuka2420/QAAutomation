package optional;

public class BubbleSort implements Sortable {
	
	public void sort(int [] x) {
		
		int l=x.length;
		int temp=0;
		
		for(int i=0;i<l;i++) 
		{
			for(int j=1;j<l-i;j++) {
				
				if(x[j-1]>x[j]) {
					
					temp=x[j-1];
					x[j-1]=x[j];
					x[j]=temp;
					
				}
				
			}
		}
		
	}

	public static void main(String[] args) {
	
		BubbleSort b=new BubbleSort();
		
		int x[]= {8,2,0,5,76,32,23,54,43};
		System.out.println("before bubblesort");
for(int i=0;i<x.length;i++) {
			
			System.out.print(x[i]+" ");
		}
		System.out.println();
		b.sort(x);
System.out.println("Array bubblrsort");
		
		for(int i=0;i<x.length;i++) {
			
			System.out.print(x[i]+" ");
	}

	}}
