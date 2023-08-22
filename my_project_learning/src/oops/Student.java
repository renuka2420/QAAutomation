/*Write a program to print the names of students by creating a Student class.
 *  If no name is passed while creating an object of Student class, 
 *  then the name should be "Unknown", otherwise the name should be 
 *  equal to the String value passed while creating object of Student class.*/



package oops;

public class Student {
	
	Student(){
		
		System.out.println("the name is unkown");
	}
	Student(String str){
		
		System.out.println(str);	
	}
	
	public static void main(String[] args) {
		
		Student s1=new  Student();
		Student s2=new  Student("renu");
	}

}
