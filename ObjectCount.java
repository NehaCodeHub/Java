package JavaBasics;

public class ObjectCount {
 private static int count=0;
    static String fname;
    static String lname;
 
 
 ObjectCount(String fname, String lname){
    	
    	this.fname=fname;
    	this.lname=lname;
    	System.out.println(fname);
    	System.out.println(lname);
    	System.out.println(count++); //so everytime u call the constructor,count will increase and finally will get the count of objects created by a class.
	 	
 }
 
 
 public static void main(String []args) {
	 
	 
	 ObjectCount obj1= new ObjectCount("Neha", "Gupta");
	 ObjectCount obj2= new ObjectCount("Monika", "Gupta");
	 
 }
 
 
 
}
