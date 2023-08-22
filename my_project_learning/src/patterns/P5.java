package patterns;

public class P5 {
public static void pattern() {
		
		
	int n=4;  
	//inner loop  
	for (int i= n; i>= 1; i--)  
	{  
	for (int j=n; j>i;j--)  
	{  
	System.out.print(" ");  
	}  
	for (int k=1;k<=i;k++)  
	{  
	System.out.print("*");  
	}  
	System.out.println("");    
	}  
	}  
	

	public static void main(String[] args) {
		
		pattern();
		

	}

}
