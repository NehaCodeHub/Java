package JavaBasics;

public class LogicalPograms {

	public static void main(String[] args) {
		
		//swap two numbers
		
		
		int a=5;
		int b=6;
	  
	  a= (a+b); //11
	  b= a-b;  //11-6=5
	  a= a-b;  //11-5=6
	  
	  System.out.println(a);
	  System.out.println(b);
	
	}

}

//import java.util.*; 
//public class HashMapDemo { 
//    public static void main(String args[]) 
//    { 
//        // Creating HashMap and 
//        // adding elements 
//        HashMap<Integer, String> hm 
//            = new HashMap<Integer, String>(); 
//  
//        hm.put(1, "Geeks"); 
//        hm.put(2, "For"); 
//        hm.put(3, "Geeks"); 
//  
//        // Finding the value for a key 
//        System.out.println("Value for 1 is " + hm.get(1)); 
//  
//        // Traversing through the HashMap 
//        for (Map.Entry<Integer, String> e : hm.entrySet()) 
//            System.out.println(e.getKey() + " " + e.getValue()); 
//    } 
//} 