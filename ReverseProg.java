package JavaBasics;

public class ReverseProg {

	public static void main(String[] args) {
		String s="123";
		int size= s.length();
		String rev="";
		
		for(int i=size-1;i>=0;i--) 
			
			
			rev=rev+ (s.charAt(i));
			if(rev.equals(s)) {
				
				System.out.println(s+" "+ "is Palindrome");
			}
			
			else {
				System.out.println(s+" "+ "is not Palindrome");
			}
			
		}

}
