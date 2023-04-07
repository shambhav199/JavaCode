package com.java;
	import java.util.Scanner;
	public class sumNumPrime {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number");
	        int num = sc.nextInt();
	        int digit = 0;
	        int t =num;
	        while(t != 0){
	            digit += t%10;
	            t /=10;
	        }
	        System.out.println(digit);
	        int k=0;
	        for(int i=1; i<= digit; i++){
	            if(digit % i == 0){ k++; }
	        }
	        if(k == 2) {System.out.println("Prime number");}
	        else {System.out.println(" Not Prime number");}
	    }   
	}
