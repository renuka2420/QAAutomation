package optional;

public class Developer extends Employee{

	
	String ProgrammingLanguage;
	
	Developer(String Name,double Salary,String ProgrammingLanguage)
	{
		super(Name,Salary);
		
		this.ProgrammingLanguage=ProgrammingLanguage;
		System.out.println(ProgrammingLanguage);
	}
	void displayInfo() {
			
			System.out.println("in the developer class");
		}
	
	
	public static void main(String[] args) {
		
		Developer d=new Developer("thota",10000,"java");
		d.displayInfo();
	}

}
