//reverse string without using reverse command

package day2;

public class ReverseString {

	
	public void reverse(String x) {
		int n=x.length();
		
		
	//using for loop	
		
	/*	for(int i=n;i>0;i--) {
			
			
			System.out.print(x.charAt(i-1));
	
		}
		
	}*/
		//using while loop
		int i=n;;
		while(  i>0) {
			//i=n;
			
			System.out.print(x.charAt(i-1));
			i--;
		}
			
			
	}		
		
	public static void main(String[] args) {
		String x="renuka is working";
		
		System.out.println("original string:"+x);
		
		ReverseString obj=new ReverseString();
		obj.reverse(x);
		
		
		
		
		

	}

}

/*public static String reverseString(String str) {

char ch[]=str.toCharArray();

String rev="";


for(int i=str.length()-1;i>=0;i--) {
	
	rev=rev+ch[i];
	
}
return rev;
}


public static void main(String[] args) {


String s1=	ReverseWordString.reverseString("renuka devi thota");
System.out.println(s1);



}*/