//WAP to generate even and odd numbers between 1 and 100.
package com.javaconcepts;

public class EvenOdd {

	public static void main(String[] args) {
		System.out.println("number from 1 to 100 is :");
		
		for(int i=1; i<=100; i++) {
			if(i%2==0){
				System.out.println(" Even number is " +i);
			}
			else{
				System.out.println(" Odd number is " +i);
			}
		}
		
	}

}
