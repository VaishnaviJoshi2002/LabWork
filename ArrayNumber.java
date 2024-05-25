/* Write a program that asks the user to input ten integers and stores them in an array.
 The program should then find and print the smallest and largest values in the array.
  */
package com.javaconcepts;

import java.util.Scanner;

public class ArrayNumber {

	public static void main(String[] args) {
		
		int i,max,min = 0;
		//Initialize the array size is 10.
		int[] a=new int[10];
		//Taking  ten input values for user.
		System.out.println("Enter Ten Values in array:");
		Scanner sc=new Scanner(System.in);
		
		for(i=0; i<=9; i++) {
			//iterating loop.
			a[i]=sc.nextInt();
			
		}
		
		max=a[0];
		for(i=0; i<=9; i++) {
			//to check maximum number for that array.
			if(a[i]>max) {
				
				max=a[i];
			}
			
		}
		System.out.println("Maximum number in array is: "+max);
		
		min=a[0];
		for(i=0;i<=9;i++) {
			//to check minimum number for that array.
			if(a[i]<min) {
				
				min=a[i];
			}
		}
		System.out.println("Minimum number in array is: "+min);
		}
	
}
