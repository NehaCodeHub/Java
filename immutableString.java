package JavaBasics;

public class immutableString {
  public static void main(String args[]) {
	  
	//String immutable  
	String s= "Monika";
	s.concat("Gupta");
	System.out.println(s);
	
	
	String s1="Sachin";  
	   String s2="Sachin";  
	   String s3="Ratan";  
	   System.out.println(s1.compareTo(s2));//0  
	   System.out.println(s1.compareTo(s3));//1(because s1>s3)  
	   System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )  
	   String sn=10+10+"Sachin"+40*40;  
	   System.out.println(sn);
	   
	//String Buffer mutable  
	 StringBuffer s4= new StringBuffer("hello");
	 s4.append("world");
	 System.out.println(s4.toString());
	   
}
  
}
