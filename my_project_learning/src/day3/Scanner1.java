package day3;

import java.util.*;


public class Scanner1 {

	
	public void readandprint() {
		
		Scanner  sc =new Scanner(System.in);
		System.out.println("entr the int value");
		int num=sc.nextInt();
		System.out.println("entr the Double value");
		double num1=sc.nextDouble();
		System.out.println("entr the float value");
		float num2=sc.nextFloat();
		System.out.println("entr the bool value");
		boolean num3=sc.nextBoolean();	
		
		System.out.println("int :"+num);
		System.out.println("double :"+num1);
		System.out.println("float :"+num2);
		System.out.println("boolean :"+num3);
		
				
		double add =num+num1;
		int mul=(int) (num*num1);
		
		double div=(num1)/(num2);
		
		System.out.println(add);
		System.out.println(mul);
		System.out.println(div);
		
		sc.close();
			
	}
	
	
	public void m1(){
		System.out.println("entr the name");
		System.out.println("entr the age");
		System.out.println("entr the gender");
		System.out.println("entr the address");
		Scanner  sc =new Scanner(System.in);
		String name="";
		int age=0;
		String gender="";
		String address="";
		if(sc.hasNext()) {
			name=sc.nextLine();
			age=sc.nextInt();
			gender=sc.nextLine();
			address=sc.nextLine();
			
		}
	
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(address);
		sc.close();
		
	}
	public static void main(String[] args) {
		
		Scanner1 obj =new Scanner1();
		//obj.readandprint();
	obj.m1();
		
	
		

	}

}
