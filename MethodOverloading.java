package JavaBasics;

public class MethodOverloading {

	public static void main(String[] args) {
		   
		MethodOverloading obj= new MethodOverloading();
            obj.sum();	
            obj.sum(5);

	}
    
	public void sum() {
		  int x=10;
		  int y=20;
		  System.out.println(x+y);
		
	}
	
	public void sum(int i) {
		int j=20;
		int add= i+j;
		System.out.println(add);
		
	}
	
	public void sum(int i, int j) {
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
