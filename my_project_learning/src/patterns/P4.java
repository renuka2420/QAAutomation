package patterns;

public class P4 {
public static void pattern() {
		
		
		
		for (int i=0;i<4;i++)
		{
			
			for(int j=4;j>i;j--) 
			{
				
				System.out.print(" *");
			}
			System.out.println();
				for(int j=0;j<=i;j++) 
				{System.out.print(" ");
				}
			}
			System.out.println();
		}


	public static void main(String[] args) {
		
		pattern();
		

	}
}
