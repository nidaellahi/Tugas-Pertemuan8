package Tugas2;

public class MyClassFibonacci implements Runnable {

	String hasil;
	public MyClassFibonacci() {
		  int a = 20;
		  int b = 0;
		  int c = 1;
		  
		  try {
			String name = Thread.currentThread().getName();
	        System.out.print( "20 Bilangan Fibonaci: ");
	        for (int i = 1; i <= a; ++i)
	        {
	            System.out.print( b + " ");
	            int sum = b + c;
	            b = c;
	            c = sum;
	        }
	        
	        	Thread.sleep(60000);
	        }catch(InterruptedException e) {
	        	e.printStackTrace();
	        }
	        
	}

	@Override
	public void run() {
		System.out.println(hasil);	
	}
}
