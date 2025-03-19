package Session3;

import java.util.Scanner;

public class Nestedforloop {
	
      public static void main(String[] args) {
	/*      for(int i = 1 ; i<=4 ; i++) 
	   { 
		for(int j = 1 ; j<=4 ; j++) {
		//System.out.print(i);//
		System.out.print(" " +j);
		}
		System.out.println();
	}
    }
}*/
		

/*int num = 6;
for(int i=0 ; i<=num ; i++) {
	for(int j=1 ; j<=num-i ; j++ ) {
		System.out.print("* ");
	}
	System.out.println();
}
      }
}*/
    	  
    	  
    	  //diamond pattern
    	  Scanner sc = new Scanner(System.in);
    	  
    	  System.out.println("enter no of rows: ");
    	  int rows = sc.nextInt();
      
    	  for(int i = 1 ; i<=rows ; i++) {
    		  for(int j = i ; j<rows ; j++) {
    	  System.out.print(" ");
    		  }
    		  
    		  for(int k = 1 ; k<=(2*i-1); k++){
    			  System.out.print("*");
    		  }
    		  System.out.println();
    	  }
      
    	 for(int i = rows-1 ; i>=1 ; i--) {
    		  for(int j = rows ; j>i ; j--) {
    	  System.out.print(" ");
    		  }
    		  
    		  for(int k = 1 ; k<=(2*i-1); k++){
    			  System.out.print("*"); 
    
      }
    		  System.out.println();
    	 }
      }
}
