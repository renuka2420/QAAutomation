//Test if an array contains a specific value

package day4;

public class TestArray {
	
	
	public static int search(String[] arr,String key) {
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==key) {
		
		return i;
		//System.out.println("element found"+i);
			
		}
		
	}return -1;
		//System.out.println("element not found");
	}

	public static void main(String[] args) {
		
String str[]= {"put","but","cut","hut","nut","pot","map","cap","nap","lap"};
String key="cap";
int s1=search(str,key);
System.out.println("found at index " +s1);



	}

}
