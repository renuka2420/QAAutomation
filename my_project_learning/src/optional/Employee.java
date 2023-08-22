/*Create a class called Employee with properties name and salary. 
 * Derive two classes, Manager and Developer, from Employee.
 *  The Manager class should have an additional property called bonus,
 *  and the Developer class should have an additional property 
 *  called programmingLanguage. Implement a method called displayInfo() 
 *  in each class to display the information specific to that class.
 *   Write a program that demonstrates polymorphism by creating objects 
 *   of both derived classes and calling the displayInfo() method on each
 *    object.
 */

package optional;

public class Employee {
	
	String Name;
	double Salary;
	
	Employee(String Name,double Salary){
		
		this.Name=Name;
		this.Salary=Salary;
        System.out.println(Name);
		System.out.println(Salary);
		
	}

 void displayInfo() {
		
		
		System.out.println("in the employee class");
	}
	
public static void main(String[] args) {
	
	Employee e=new Employee("renu",8000);
	
	e.displayInfo();
Employee e1=new Manager("sai",6000,1600);
e1.displayInfo();
Employee e2=new Developer("kiaan",4000,"c");
e2.displayInfo();
	}
}
