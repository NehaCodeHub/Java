package OOPConcept;

public class BMW extends Car {

	public void start() {
		// method overriding
		System.out.println("start....BMW");
	}
	
     public void theftSafety() {
		
		System.out.println("theftSafety....BMW");
	}
     
     public static void main (String [] args) {
    	 
    	 // static polymorphism- compile time polymorphism beacuse at the time of compilation java will decide which method to call
    	 BMW b= new BMW();
    	 b.start();  //overriden method
    	 b.stop();
    	 b.fuel();
    	 b.theftSafety();
    	 
    	 
    	 Car c= new Car();
    	 c.start();
    	 c.stop();
    	 //c.theftSafety();// not possible
    	 
    	 //dynamic polymorphism- run time - child class object can be referred by parent class reference variable.
    	 Car c1= new BMW();  //top casting
    	 b.start();
    	 //c1.theftSafety();
    	 c1.stop();
    	 
    	 //down casting---not allowed in java
    	 
    	 //BMW b= new Car(); // ClassCastException
    
     }
}
