package StaticMemberConcept;

public class StaticVariable {
        
	static int a=20;
	    int b=30;
	
	public static void main(String[] args) {
		
		StaticVariable obj1= new StaticVariable();
		StaticVariable obj2= new StaticVariable();
		
		System.out.println(obj1.a); //20
		System.out.println(obj1.b);  //30
		
		System.out.println(obj2.a); //20
		System.out.println(obj2.b);  //30
		
		System.out.println(a);   //20
		//System.out.println(b); // we cannot call Non static variable under static mehod(). Only be called using object reference.
		
		obj1.a=40;
		System.out.println(obj1.a); //40
		
		System.out.println(obj2.a);  //40

	}

}
