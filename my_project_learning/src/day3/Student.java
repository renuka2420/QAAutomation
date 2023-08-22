package day3;

public class Student {

	 
		String name;
		int roll_no;
		
		Student(String name,int roll_no)
		{
			this.name=name;
			this.roll_no=roll_no;
		}
		
		public static void main(String[] args) {
	 
		Student s1=new Student("John",2);
		System.out.println(s1.name);
		System.out.println(s1.roll_no);
		
	
		
	}

}
