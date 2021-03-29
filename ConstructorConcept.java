package JavaBasics;

public class ConstructorConcept {
    
//	String name="Tom";
//	int age=23;
	
    //global /class variables
	String name;
	int age;
	
     public ConstructorConcept(String name, int age) {
    	 this.name=name;   ///the value from name is passed to class variable this.name 
    	 this.age=age;
    	 System.out.println(name);
    	 System.out.println(age);
    	 
     }
	
	public static void main(String[] args) {
	
	    ConstructorConcept cp= new ConstructorConcept("neha", 26);	
	
     }
}