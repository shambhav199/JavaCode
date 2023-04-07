package com.java;

public class SWAPNUMBERS {
	public static void main(String[] args) {
		
		int a=10, b=30  ;
		System.out.println(a+" , "+b);
		
		//LOGIC1 third variable
		int t=a;
		a=b;
		b=t;
		System.out.println(a+" , "+b);
		
		
		
		//LOGIC2 add sub
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 System.out.println(a+" , "+b);
		
		 
		 
		//LOGIC3 multiply divide
		a=a*b;
		b=a/b;
		a=a/b; 
		System.out.println(a+" , "+b);
		
		
		//LOGIC4 XOR
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a+" , "+b);
		
		
		//LOGIC5 single statement
		b=a+b-(a=b);
		
		
		System.out.println(a+" , "+b);
		

}
}
