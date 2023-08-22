package oops;

public class ConsoleLogger implements Logger {
	
	
	public void log(String message) {
		
		System.out.println("consolelogger "+ message);
	}

	
}
