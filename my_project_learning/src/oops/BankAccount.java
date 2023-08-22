/*Create an abstract class named "BankAccount" with abstract methods named 
 * "deposit()" and "withdraw()". Implement this class in two subclasses named
 *  "CheckingAccount" and "SavingsAccount" with their own implementation
 *   of the "deposit()" and "withdraw()" methods. 
 *   Create an interface named "Interest" with a method 
 *   "calculateInterest()" that takes no arguments and returns void. 
 *   Implement this interface in the "SavingsAccount" class with its 
 *   own implementation of the "calculateInterest()" method. 
 *   Write a main method to create objects of both classes and call 
 *   their respective "deposit()", "withdraw()", and "calculateInterest()" 
 *   methods.
 */

package oops;

public abstract class BankAccount
{
	public abstract void deposit();
	public abstract void withdraw();
	
}
	
	
	



