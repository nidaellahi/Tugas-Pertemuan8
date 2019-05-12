package Tugas1;

import java.util.Scanner;

public class Ganjilgenap implements Runnable {

	String hasil;
	public Ganjilgenap(int angka) {
		if (angka % 2 == 0)
	         System.out.println("Bilangan Genap");
	     else 
	         System.out.println("Bilangan Ganjil"); 
	  	try {
	  		Thread.sleep(30000);
	  	}catch(InterruptedException e) {
	  		e.printStackTrace();
	  	}
	}

	@Override
	public void run() {
	    System.out.println(hasil);
	    
	}
}
