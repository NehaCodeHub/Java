package CollectionsConcept;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		ArrayList ar= new ArrayList();
		
		  ar.add(100);
		  ar.add(200);
		  ar.add("neha");
				  
		System.out.println(ar.size());  // length of array
		System.out.println(ar.get(1));  // get value from passed index 
		
		
		//to print the array list
		for(int i=0;i< ar.size();i++) {
			
			System.out.println(ar.get(i));
		}
		
		
		ArrayList<Integer> ar1= new ArrayList();
		ar1.add(1000);
		//ar1.add("neha");  this is not allowed and we get error
		System.out.println(ar1.get(0));

	}

}
