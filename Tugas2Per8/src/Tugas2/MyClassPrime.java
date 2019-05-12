package Tugas2;

public class MyClassPrime implements  Runnable{

	String hasil;
	public MyClassPrime() {
		 int a =0;
		 int b =0;
		 String  Prima = "";
		 
		 try {
			 String w = Thread.currentThread().getName();
		    	for (a = 1; a <= 29; a++){        
		          int c=0;    
		          for(b =a; b>=1; b--){
		             if(a%b==0){
		   c = c + 1;
		      }
		   }if (c ==2){
		      Prima = Prima + a + " ";
		   }
		       } 
		       System.out.println( "10 Bilangan Prima :");
		       System.out.println(Prima);
		       Thread.sleep(60000);
		 }catch (InterruptedException e) {
			 e.printStackTrace();
		 }
	 }

	@Override
	public void run() {
	
	
		
		}
	}


