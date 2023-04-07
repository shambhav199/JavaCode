package com.java;
import java.util.Scanner;

public class FACTORIAL {
	public static void printFactorial(int n) {
		if (n<0) {
		System.out.println("Invalid no.");
		}
		
		int factorial = 1;
		for (int i=n; i>=1; i--) {
			factorial=factorial*i ;
		}
		System.out.println(factorial);
		
		}
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			
			printFactorial(n);
			
		}
	
	}
