package oops;

public class Bank {

	public static void main(String[] args) {
		CheckingAccount obj=new CheckingAccount();
		obj.deposit();
		obj.withdraw();
		SavingsAccount obj1=new SavingsAccount();
		obj1.deposit();
		obj1.withdraw();
		obj1.calculateInterest();
	}

}
