package JavaBasics;

public class ReverseWords {

	public static void main(String[] args) {
		
		String str="Neha Gupta";
		 String[] s= str.split(" ");
		 
		 String rev="";
		 
		 
		 for(int i= s.length-1; i>=0; i--) {
			 
			  rev=rev+ s[i]+" ";
			  
			  System.out.println(rev);
			  
			  				 
 }
		
		
		
	//input=  Neha Gupta
	//output= Gupta Neha	 
			
	}

}
