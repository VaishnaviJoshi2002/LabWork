//WAP to check Whether the number is Armstrong number or not using class and object concept
package com.javaconcepts;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int n, sum = 0, rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");//Taking user input.
		n=sc.nextInt();
		int temp=n;
		
		while(n>0) {//Armstrong Logic.
			
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		
		if(temp==sum) {//checking number is armstrong or not.
			
			System.out.println("This number is Armstrong number:" +sum);
		}
		else
		{
			
			System.out.println("This number is not Armstrong..");
		}
	}

}
