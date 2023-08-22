package day3;

public class Student1 {
	
	String name;
	int roll_num;
	long phone;
	String address;
	
	Student1(String name,int roll_num,long phone,String address ){
		this.name=name;
		this.roll_num=roll_num;
		this.phone=phone;
		this.address=address;
		
		
	}
	

	public static void main(String[] args) {
		Student1 s1=new Student1("Sam",21,6786787878l,"leander,texas");
		Student1 s2=new Student1("John",12,4564564566l,"Houston,arizone");
		
		System.out.println(s1.name);
		System.out.println(s2.address);
	//s1.roll in same print how to do like s1.roll,s1.name,s1.address?	

	}

}
