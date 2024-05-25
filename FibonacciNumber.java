//// WAP to generate fibonacci series 0 1 1 2 3 5 8
package com.javaconcepts;

import java.util.Scanner;

public class FibonacciNumber {
	
	public static void main(String args[])
	{
		int a=0, b=1, sum, i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a numbers:");
		n=sc.nextInt();
		System.out.println(a);
		System.out.println(b);
		
		for(i=3; i<=n;i++)
		{
			sum=a+b;
			a=b;
			b=sum;	
			
			System.out.println(sum);
		}
	}
}
