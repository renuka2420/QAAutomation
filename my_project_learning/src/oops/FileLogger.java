package oops;

public class FileLogger  implements Logger{
	public void log(String message) {
		
		System.out.println("filelogger "+message);
	}

	
}
