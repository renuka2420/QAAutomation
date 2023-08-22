//sort a numeric array and a string array

package day4;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		
		
		int numeric []= {6,9,2,56,74,31,42,9};
		String words[]= {"java","code","python","ruby","clear"};
		
		System.out.println("the original numeric array is:"+ Arrays.toString(numeric));
		
		Arrays.sort(numeric);
		System.out.println("the  numeric array is:"+ Arrays.toString(numeric));
		
		System.out.println("the original String array is:"+ Arrays.toString(words));
		Arrays.sort(words);
		System.out.println("the  String array after sorting is:"+ Arrays.toString(words));
		
	}

}
