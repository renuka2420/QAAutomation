/*Create an interface named "Logger" with a method "log(String message)" 
 * that takes a string message as an argument and returns void. 
 * Implement this interface in two classes named "ConsoleLogger" and 
 * "FileLogger" with their own implementation of the "log()" method. 
 * Write a main method to create objects of both classes and call their 
respective "log()" methods with a message*/

package oops;

public interface Logger {
	
	public abstract void log(String message);

}
