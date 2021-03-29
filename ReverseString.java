package JavaBasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="Automation";
		char[] charray= str.toCharArray();
		
	    ArrayList<Character>  al= new ArrayList<Character>();

			for(char c: charray)
				
				al.add(c);
				
		Collections.reverse(al);
		
		
		ListIterator<Character> itr= al.listIterator();
		
		while(itr.hasNext()){
			
			System.out.print(itr.next());
		}
		
		
		
		
		
		
		
	}

}
