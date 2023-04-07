package com.java;

import java.util.Scanner;

public class PALINDROME {
	public static void main(String args[]) {
		int rem,temp,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NO. : ");
		int n = sc.nextInt();
		temp=n;
		while(n>0) {
		rem=n%10;
		sum=(sum*10)+rem;
		n=n/10;
		}
		if(temp==sum) {

			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}

	}
