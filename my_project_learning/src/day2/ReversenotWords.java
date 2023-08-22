
/*my name is renuka to renuka is name my*/

package day2;

public class ReversenotWords {
	
	public static void reversestrinr(String s) {
		String words[]=s.split(" ");
		String rev="";
		for(int i=words.length-1;i>=0;i--)
		{
			String word=words[i];
		
			
			for(int j=0;j<=word.length()-1;j++) 
			{
				
				rev=rev+word.charAt(j);
				
			}
			rev=rev+" ";
		}
		
		System.out.println(rev);
		
	}

	public static void main(String[] args) {
		
String s="my name is renuka";
reversestrinr(s);

	}

}
