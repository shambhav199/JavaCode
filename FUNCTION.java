package com.java;
import java.util.Scanner;


public class FUNCTION {
	public static int addition(int a, int b) {
		int sum=a+b;
		return sum; 
	}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			
			int sum=addition(a,b);
			System.out.print(sum);
		
	}
}