package CollectionsConcept;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		Hashtable h= new Hashtable();
		 h.put("Name","Neha");   //stores values in key, value pair
		 h.put("State", "Bangalore");
		 
		 System.out.println(h.size());
//		  for(int i=0; i<h.size();i++) {
//			  System.out.println(h.get(i));
//		  }
		 
		 
		 System.out.println(h.get("Name"));// call value using key
		 System.out.println(h.get("State"));
			}

}
