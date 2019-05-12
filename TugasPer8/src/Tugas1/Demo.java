package Tugas1;

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Input Your Number");
		int angka = scan.nextInt();scan.nextLine();
		 
		Ganjilgenap ganjilgenap = new Ganjilgenap(angka);
		Thread thread = new Thread();
		Fibonacci fibonacci = new Fibonacci(angka); 
		Thread thread1 = new Thread();
		thread.start();
		thread1.start();
	
	}

}
