package patterns;

public class EquiTrainge {
	
	
	public static void equiTraingle() {
		
		int rows=6;
		
		for (int i=0;i<=rows;i++)
		
		{
			for(int j=rows;j>i;j--) 
			{
		
		System.out.print(" ");
			}
		
			for(int j=0;j<i;j++)
			{
				
				System.out.print("* ");
			}	
			System.out.println();
		}
			
		}
		
	
	
	

	public static void main(String[] args)
	{
		
		
		equiTraingle();

	}

}
