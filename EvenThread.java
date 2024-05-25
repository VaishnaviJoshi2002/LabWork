//Create two threads to print odd numbers and even numbers from 1 to 100?
package com.javaconcepts;

public class EvenThread extends Thread {
	
	public void run() {
		
		System.out.println("Even numbers between 1 to 100:");
		for(int i=1; i<=100; i++) {
			
			if(i%2==0) {
				// checking even condition.
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		EvenThread obj=new EvenThread();
		obj.start();

	}

}

