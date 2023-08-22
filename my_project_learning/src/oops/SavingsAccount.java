package oops;

public class SavingsAccount extends BankAccount implements Interest{
	
public  void deposit() {
		
		System.out.println("deposit in savings account");
		
	}
	public void withdraw() {
		System.out.println("withdrawl in savings account");
		
	}
	public void calculateInterest() {
		
		System.out.println("calculate interest  in savings account");
		
	}

	

}
