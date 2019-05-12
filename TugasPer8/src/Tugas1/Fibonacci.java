package Tugas1;

public class Fibonacci implements Runnable {

	int firstNumber=0;
	int secondNumber=1;
	int fibonacci=0;
	int angka;
	String hasil;
	public Fibonacci(int angka) {
		while(fibonacci < angka){
			fibonacci = firstNumber + secondNumber;
			firstNumber=secondNumber;
			secondNumber=fibonacci;
		}
		if(angka == fibonacci) {
			System.out.println("Merupakan Angka Fibonacci");
		}else {
			System.out.println("Bukan Angka Fibonacci");
		}
	}
	@Override
	public void run() {
		  try {
		    	Thread.sleep(30000);
		    }catch (InterruptedException e) {
		    	e.printStackTrace();
		    }
		System.out.println(hasil);
	}

}
