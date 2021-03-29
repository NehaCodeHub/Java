/* Static method inside static method:
	 * 1. Directly
	 * 2. Using class name.
	 * 3. Using object but throw warning.
	 * 
	 * Static Global Variable inside static method:
	 * 1. Directly
	 * 2. Using class name.
	 * 3. Using object but throw warning. 
	 * 
	 * Static method inside non static method:
	 * 1. Directly
	 * 2. Using class name.
	 * 3. Using object but throw warning.
	 * 
	 * Static Global Variable inside non static method:
	 * 1. Directly
	 * 2. Using class name.
	 * 3. Using object but throw warning. 
	 * 
	 * Non static method inside static method:
	 * 1. Only using object
	 * 
	 * Non Static global variable inside static method:
	 * 1. Only using object
	 * 
	 * Non static method inside non static method:
	 * 1. Directly
	 * 2. Using object
	 * 
	 * Non Static global variable inside non static method:
	 * 1. Directly
	 * 2. Using object
	 */

package JavaBasics;

public class StaticNonStaticConcept {
	
      //static non static global variables
	  static int a=10;
	  int b=20;
	
	public static void main(String[] args) {
		// calling static variable 
		System.out.println(a); //directly
		System.out.println(StaticNonStaticConcept.a);  //using classname
		
		//calling non static variable,, need to create object
		
		StaticNonStaticConcept obj= new StaticNonStaticConcept();
		System.out.println(obj.b);// using object
		     
		//calling non static method
		obj.sum();
		
		//calling static method
		sum(50);
	}
	
	int m=20;
	//Non static method
	public void sum() {
		  int x=10;
		  int y=20;
		  System.out.println(x+y);
		  System.out.println(m);
		
	}
	// Non static method
	public static void sum(int i) {
		int j=20;
		int add= i+j;
		System.out.println(add);
		
	}
	

}
