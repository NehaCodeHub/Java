//package JavaBasics;
//
//public class duplicateChar {
//	
//		      public static void main(String args[]) {
//		      String str = "beautiful beach";
//		      char[] carray = str.toCharArray();
//		      System.out.println("The string is:" + str);
//		      System.out.print("Duplicate Characters in above string are: ");
//		      
//		      for (int i = 0; i < str.length(); i++) {
//		         
//		    	  for (int j = i + 1; j < str.length(); j++) {
//		            
//		        	 if (carray[i] == carray[j]) {
//		               
//		        		 System.out.print(carray[j] + " ");
//		               
//		        		 break;
//		            }
//		         }
//		      }
//		   }
//		}

package JavaBasics;

import java.util.Scanner;

public class duplicateChar{
	
	public static void main(String[] args) {
		
		 //Scanner sc=new Scanner(System.in);
		 
		 //String str= sc.nextLine();
		 //System.out.println("original string: "+ str); 
		 String str="nehaguptaenoo";
		 char[] charr= str.toCharArray();
		 
		 
		   // to find the duplicate char in a string
		 
		 for(int i=0; i<charr.length; i++) {
			 
			 for(int j=i+1; j<charr.length; j++) {
				 
				 if(charr[i]==charr[j]) 
					 
					 
					 System.out.print(charr[i]);
					 
				 
				
				
			 }
			 
			 
		 }
	}
		
	}
	
	
