//WAP to find Greatest among three number using Nested if
package com.javaconcepts;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		int n1,n2,n3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three values:");// taking user input.
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		
		if(n1>n2)//checking condition if n1 is greater then n2.
		{
			if(n1>n3)//checking n1 greater then n3.
			{
				System.out.println("n1 is greatest number "+n1);
			}
			else{
				System.out.println("n3 is greatest number"+n3);
				}
		}
		else
		{
			if(n2>n3)// checking n2 greater then n3.
			{
				System.out.println("n2 is greatest number "+n2);
			}
			else{
				System.out.println("n3 is greatest number "+n3);
				}
		}
	}

}
