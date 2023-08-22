
/*Create an interface called Sortable with a method sort() that sorts an array
 *  of integers in ascending order. Implement this interface in two classes: 
 *  BubbleSort and QuickSort. The BubbleSort class should implement the bubble sort 
 *  algorithm, and the QuickSort class should implement the quicksort algorithm. 
 *  Write a program that creates objects of both classes,
 *   passes an array of integers to each object, and invokes the sort()
 *    method to sort the array using each algorithm.
 */

package optional;

public interface Sortable {

	public abstract void sort(int [] a);
	
	
	
	
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

	}
}
