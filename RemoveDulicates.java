package JavaBasics;

import java.util.HashSet;
import java.util.Set;

public class RemoveDulicates {

public static void main(String []args) {
String str = "Java";
char[] c= str.toCharArray();

Set<Character> set= new HashSet<Character>();
StringBuffer sb= new StringBuffer();  //sb is a class  used to create mutable String

for(int i=0; i< c.length; i++) {
	
	if(!set.contains(c[i])) {
		
		set.add(c[i]);
		sb.append(c[i]);
		
	}
}

     System.out.println(sb);

}



}

