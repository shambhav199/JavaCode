package com.java;


	import java.util.Scanner;
	public class sort {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int a[] = new int[10];
	        int e,k=0;
	        System.out.println("Enter the 10 element in array");    
	        for(int i=0; i<10; i++){
	            a[i] = sc.nextInt();
	        }
	        for(int i=0; i<10; i++){
	            for(int j=i; j<10; j++){
	                if(a[i] > a[j]){
	                    int temp = a[i];
	                    a[i] = a[j];
	                    a[j] = temp;
	                }
	            }
	        }
	        System.out.println("The element:"); 
	        for(int i=0; i<10; i++){
	            System.out.println(a[i]);
	        }
	        System.out.println("Enter element to search:");
	        e = sc.nextInt();
	        for(int i=0; i<10; i++){
	            if(a[i] == e){
	                k=1;
	            }
	        }
	        if(k==1){ System.out.println("Found"); }
	        else{ System.out.println("Not Found"); }
	    }
	}



