package MultiThreadConcept;

import java.io.EOFException;

public class SleepConcept extends Thread {
	
	 public void run() {
		 
		 for(int i=1;i<=5;i++) {
			 
			 try{
				 Thread.sleep(5000);
			 }
			  
			 catch(Exception e) {
				 System.out.println(e);
			 }
	      System.out.println(i); 
		 }
			 
	}
	public static void main(String[] args) {
		SleepConcept t1= new SleepConcept();
		SleepConcept t2=new SleepConcept();
		t1.start();
		//t2.start();

	}

}
