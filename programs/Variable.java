
package programs;

public class Variable {
     int a = 25;
     static int b = 50;
 
     public static int print() {
    	 int mark = 94;
    	 return mark;
     }
     
     void display() {
   	  int d = 60;
   	  System.out.println("method onside variable:"+d);
     }
     
     public static void main(String[] args) {
   	  int c = 75;
   	  
   	   Variable obj1 = new Variable();
   	   System.out.println(obj1.a);
   	   obj1.display();
   	   System.out.println(b);
   	   System.out.println(c);
   	   System.out.println(print());
   	   
   	   Variable2.show();
   	   Variable v2 = new Variable();
   	   v2.students();
     }

	private void students() {
		// TODO Auto-generated method stub
		
	}
}


