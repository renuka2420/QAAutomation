package day1;

public class EvenOdd {
	
	
	public static void even() 
	
	{
		for(int i=0;i<50;i++)
		{
			
			if(i%2!=0) 
			{
				
				//System.out.print(i+" ");
				
			}
			
		
			else 
			{
				System.out.print(i+" ");
				
			}
		}System.out.println(" even");
			}
		public static void odd() 
		
		{
			for(int i=0;i<50;i++)
			{
				
				if(i%2!=0) 
				{
					
					System.out.print(i+" ");
				}
				
			}
			System.out.println("odd");
	}

	public static void main(String[] args) {
		
odd();
even();
	}

}
