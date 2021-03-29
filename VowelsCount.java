package JavaBasics;

public class VowelsCount {

	public static void main(String[] args) {
		String str="Automation Engineer";
		str=str.toLowerCase();
		System.out.println(str);
		int vowel=0; int consonant=0;
		
		for(int i=0; i<str.length(); i++) {
			
			char ch=str.charAt(i);
			if(ch=='a' || ch=='e'|| ch=='i'||ch=='0'||ch=='u') {
				
				vowel++;
			}
			else
			{
			  consonant++;
			}
			

	     }
		System.out.println("Vowel count= "+ vowel);	
		System.out.println("Consonant count= "+ consonant);	
}
	
}
