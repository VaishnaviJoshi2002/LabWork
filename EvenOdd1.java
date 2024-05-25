package com.javaconcepts;

public class EvenOdd1 {

	public static void main(String[] args) {
		System.out.println("number from 1 to 100 is :");
		
		System.out.println("Even number is: ");
		for(int i=1; i<=100; i++){
			if(i%2==0){// checking even condition.
				System.out.print(i+ " ");
			
			}
		}
		System.out.println("\nOdd number is: ");
		for(int j=1; j<=100; j++){
			if(j%2!=0) {//checking odd condition.
				System.out.print(j+ " ");
			}
		}
	}
}