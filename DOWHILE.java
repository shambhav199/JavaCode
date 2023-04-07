package com.java;
import java.util.Scanner;


public class DOWHILE {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int INTEGER;
		

		do {
			System.out.println("ENTER AN INTEGER : ");
			 INTEGER = sc.nextInt();
			 System.out.println("YOUR ENTERED INTEGER : ");
			 System.out.println(INTEGER);
			}
		while (INTEGER >= 0);
		System.out.println("END");
		
	}

}
