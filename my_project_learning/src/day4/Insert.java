
//insert an element (specific position) in to array

package day4;

import java.util.Arrays;

public class Insert {

	public static void main(String[] args) {
		
      int x[]= {1,2,3,4,5,6,7,8,9};
      
      System.out.println("array before:"+Arrays.toString(x));
      
      
      int y[]=new int[x.length+1];
      
      int j=0;
      int index=4;
      
      for(int i=0;i<x.length+1;i++) {
    	  
    	  if(i==index) {
    		  y[i]=7;
    		  
    	  }
    	  else {
    		  y[i]=x[j];
    		  j++;
    		  
    	  }
    	  
      }

      System.out.println("array after:"+Arrays.toString(y));
	}

}
