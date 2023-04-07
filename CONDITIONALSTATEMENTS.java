package com.java;

import java.util.Scanner;


public class CONDITIONALSTATEMENTS {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE AMOUNT : ");
		int cash = sc.nextInt();
		
		if (cash<50) {
			System.out.println("Cannnot buy anyting");
			System.out.println("Get some more money");
		}
		else if (cash>50 && cash<100) {
			System.out.println("Can buy only one thing");
		}
		else {
			System.out.println("Can  buy both");
		}
		
		
		//conditional statemnets(switch)
		int day = 1;
		switch(day) {
		case 1:
			System.out.println("Monday");
		case 2:
			System.out.println("Tue");
			default:
				System.out.println("Wed - Sun");
		}
		
		
		int days = 3;
		switch(days) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tue");
			break;
			default:
				System.out.println("Wed - Sun");
		}
		}
	}

