
/*WJP to display number of occurrence of all character*/
package hackathonJava;

import java.util.Scanner;
public class Q19 {
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
System.out.println(" enter ur input \n");
String inputString=input.nextLine();
int[] occured=new int[128];
for(int i=0;i<inputString.length();i++)
{
if(inputString.charAt(i)!=' ')
	
occured[inputString.charAt(i)]++;

}
for(int j=0;j<occured.length;j++){
if(occured[j]!=0){
System.out.println((char)(j) + " occured "+occured[j]+ " times" );
input.close();
}
}
}}

/*public class Q19 {
	
public static void occurrence(String str) 
{
	int i, length, counter[] = new int[256];
    length = str.length();

    for (i = 0; i < length; i++)
    {
        counter[(int) str.charAt(i)]++;
    }

    for (i = 0; i < 256; i++)
    {
        if (counter[i] != 0) 
        {
            System.out.println((char) i + "  --> " + counter[i]);
        }
    }}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("the input string");
		String str=sc.nextLine();
		occurrence(str) ;
		sc.close();
		
	}

}*/
