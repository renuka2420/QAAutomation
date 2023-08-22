package optional;

public class Manager  extends Employee{
	
	double bonus;
	Manager(String Name,double Salary,double bonus){
	
	super(Name,Salary);
	this.bonus=bonus;
	System.out.println(bonus);	
		
	}


	 void displayInfo() {
			
			
			System.out.println("in the manager class");
		}
public static void main(String[] args) {
	Manager m=new Manager("devi",9000,1500);
	
m.displayInfo();
	}

}
