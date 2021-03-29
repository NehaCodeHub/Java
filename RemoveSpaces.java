package JavaBasics;

public class RemoveSpaces {
	
	
	public static void main(String[] args) {
		String str="Java is a programming language";
		char[] ch= str.toCharArray(); //converting string to char
		String str1=" ";
		
	for(int i=0; i<ch.length; i++) {
			if(ch[i]!=' ') {
				str1=str1+ch[i];
				 }
			}
		System.out.println(str1);
	}

}
