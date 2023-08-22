

package oops;

import java.util.*;
public class Area extends Shape {
	public  void RectangleArea(int l,int b) {
		int RectangleArea=l*b;
		System.out.println(RectangleArea);
	}
	public  void SquareArea(int s) {
		int SquareArea=s*s;
		System.out.println(SquareArea);
	}
	public  void CircleArea(double r) {
		
		double CircleArea=3.14*r*r;
		System.out.println(CircleArea);
	}

	
	public static void main(String[] args) {
		Area x=new Area();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("the values of l,b,s,r are:");
		int l=sc.nextInt();
		int b=sc.nextInt();
		int s=sc.nextInt();
		double r=sc.nextDouble();
		x.RectangleArea(l, b);
		x.SquareArea(s);
		x.CircleArea(r);
sc.close();
	}

}
