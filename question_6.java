package assignment5_ForLoop;

import java.util.Scanner;

public class question_6 {

	public static void main(String[] args) {
		/*
		 * Question-6:

Write a program to print Fibonacci series of n terms where n is declared by user :  0, 1, 1, 2, 3, 5, 8, 13, 21, 34,......
		 */

Scanner scan = new Scanner (System.in);
System.out.println("What is the term number ? ");
int n = scan.nextInt();

		int num1=0, num2=1;
		int sum;
		
		for(int i=2; i<= n; i++) {
			
			sum= num1+num2;
			num1 = num2;
			num2 = sum;
			}
		
		System.out.println("The final number in sequence is "+num2);
	
	}
}
