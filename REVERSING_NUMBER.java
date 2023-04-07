package com.java;

import java.util.Scanner;

public class REVERSING_NUMBER {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		int rev=0;
		
		//LOGIC1
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		
		System.out.println("Reversed number : "+rev);
		
		
		//LOGIC2 string buffer
		/*StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer.rev=sb.reverse();
		System.out.println(rev);*/
		
		
		//LOGIC3 string builder
		/*StringBuilder sbl=new StringBuilder();
		sbl.append(num);
		StringBuilder rev=sbl.reverse();
		System.out.println(rev);*/
		
		}
}
