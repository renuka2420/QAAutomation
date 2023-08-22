/*Write a program that reads a file and tries to access a non-existent file.
 *  The program should catch any NoSuchFileExceptions that may occur and
 *   print an error message.
 */


package exceptions;

import java.io.File;
import java.util.Properties;


public class Q4 {

	public static void main(String[] args) {
		try {
			
			 File f = new File("src/exceptions/renu.properties");  
		 FileReader fr=new FileReader(f);
		 Properties p=new Properties();
		 p.load(f);
		 System.out.println(p.getProperty("set"));
		}
		
			catch(Exception ex) {  
		        ex.printStackTrace();  
		    }  

		}

	

}
