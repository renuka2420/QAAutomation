package day3;

public class Triangle {
	
	 int a=3;
	 int b=4;
	 int c=5;
	
	public  void perimeter() {
		int perimeter=a+b+c;
		System.out.println(perimeter);
		
		
	}
	public  void area() {
		int s=(a+b+c)/2;
		double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println(area);
	}

	public static void main(String[] args) {
		Triangle t=new Triangle();
		t.perimeter();
		t.area();
		
		
		
		

	}

}
