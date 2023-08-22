package oops;

public class LoggerM {

	public static void main(String[] args) {
		
		FileLogger f=new FileLogger();
		ConsoleLogger c=new ConsoleLogger();
		
		f.log("renu");
		c.log("thota");

	}

}
