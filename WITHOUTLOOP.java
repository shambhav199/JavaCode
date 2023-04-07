package com.java;

public class WITHOUTLOOP {
	public static void printfrom1to100(int N) {
		if(N==100) {
			System.out.println(100);
			return;
			
		}
		System.out.println(+N);
		printfrom1to100(N+1);
		
		
	}
	public static void main(String args[]) {
		printfrom1to100(1);
	}
	

}
