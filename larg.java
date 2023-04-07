package com.java;


	import java.util.Scanner;
	public class larg {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int a[] = new int[10];
	        int min,max;
	        System.out.println("Enter the 10 element in array");    
	        for(int i=0; i<10; i++){
	            a[i] = sc.nextInt();
	        }
	        min = a[0];
	        max = a[0];
	        for(int i=0; i<10; i++){
	           if(a[i] < min) { min = a[i]; }
	           if(a[i] > max) { max = a[i]; }
	        }
	        System.out.println("Minimum: "+min+"| Maximum: "+max);
	    }    
	}



