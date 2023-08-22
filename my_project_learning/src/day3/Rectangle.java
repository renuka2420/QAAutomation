package day3;

public class Rectangle {
	int length;
	int breadth;
	
	
	Rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	
	public void area()
	{
		long area=length*breadth;
		System.out.println("The area of the traingle is "+area);
		
	}

	public static void main(String[] args) {
		Rectangle r=new Rectangle(4,5);
		Rectangle r1=new Rectangle(5,8);
		r.area();
		
		r1.area();

	}

}
