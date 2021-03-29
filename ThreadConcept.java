package MultiThreadConcept;

public class ThreadConcept extends Thread {
	
	
    public void run() {
    	
    	System.out.println("thread running...");
    }

	public static void main(String[] args) {
		
		
		ThreadConcept t1= new ThreadConcept();
		t1.start();
		
		
	}

}
