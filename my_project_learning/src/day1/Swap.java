//swap without using a temporary variable

package day1;

public class Swap {

	public static void main(String[] args) {
	int x=12;
	int y=34;
	
	x=x+y;
	 y=x-y;
	 x=x-y;
	 
	 System.out.println("now x:"+x +",y is:" +y);
	 
	
	
	}

}
