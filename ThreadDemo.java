package com.javaconcepts;

public class ThreadDemo extends Thread{

	public void run() {
		int a=10,b=20;
		int c=a+b;
		System.out.println("Thread is running");
		System.out.println("sum of two number is " +c);
	}
	
	public static void main(String[] args) {
		 ThreadDemo obj=new ThreadDemo();
		 obj.start();

	}

}
