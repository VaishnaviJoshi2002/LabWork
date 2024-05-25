/*WAP to check whether the person is eligible for getting loan or not.
Condition to grant loan is he should have salary more than 50000 and He should be citizen of INDIA.
Otherwise Loan can't be given to customer.
*/

package com.javaconcepts;

import java.util.*;
public class LoanDemo {
    public static void main(String args[])
    {
    	double sal;
        String citizen;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your salary:");// taking user input as salary.
        sal=sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter your citizen:");//taking user input as citizen.
        citizen=sc.next();

        if(sal>=50000)//checking condition salary is greater then 50000. 
        {
            if(citizen.equalsIgnoreCase("Indian"))//checking citizen is Indian or not.
            {
                System.out.println("You are eligible for loan...");
            }
            else{
                System.out.println("You are not eligible for loan...");
            }
        }
    }
}
