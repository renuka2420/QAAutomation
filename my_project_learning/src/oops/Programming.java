/*Create a class named 'Programming'. While creating an object of the class, 
 * if nothing is passed to it, then the message "I love programming languages" 
 * should be printed. If some String is passed to it, then in place 
 * of "programming languages" the name of that String 
 * variable should be printed.
 */

package oops;

public class Programming {
	Programming(){
		
		System.out.println("I love programmimg languages");
	}
	
	Programming(String str){
		System.out.println("i love "+ str);
	}
	


	

	public static void main(String[] args) {
		Programming obj=new Programming();
		
		
		String str = "renu";
		Programming obj1=new Programming(str);
         
               
               
	}

}
