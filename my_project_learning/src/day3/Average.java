package day3;
import java.util.*;

public class Average {
	
	public static void calculateAverege(int a,int b, int c) {
	
	
	double avg=(a+b+c)/2;
	System.out.println("the average of the three numbers are:"+avg);
	
	
	
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number: ");	
		int a= sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		

calculateAverege(a,b,c);
sc.close();

	}

}
