package com.java;
	import java.util.Scanner;
	public class twoLargSmall {
	    public static void main(String[] args) {
	         Scanner sc = new Scanner(System.in);
	        int a[] = new int[10];
	        System.out.println("Enter the 10 element in array");    
	        for(int i=0; i<10; i++){
	            a[i] = sc.nextInt();
	        }
	        for(int i=0; i<10; i++){
	            for(int j=i; j<10; j++){
	                if(a[i] < a[j]){
	                    int temp = a[i];
	                    a[i] = a[j];
	                    a[j] = temp;
	                }
	            }
	        }
	        System.out.println("The element:"); 
	        int l = a.length;
	            System.out.println("First Largest Element :" +a[0]);
	            System.out.println("Second Largest Element :" +a[1]);
	            System.out.println("Second Smallest Element :" +a[l-2]);
	            System.out.println("Smallest Element :" +a[l-1]);    
	    }   
	}
