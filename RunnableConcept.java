package MultiThreadConcept;

class RunnableConcept implements Runnable{  
public void run(){  
System.out.println("thread2 is running...");  
 
} 
public static void main(String args[]){  
	RunnableConcept m1=new RunnableConcept();  
    Thread t1 =new Thread(m1);  
     t1.start();  
 }  
} 