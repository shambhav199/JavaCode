package com.java;
import java.util.Scanner;
public class arrmean {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int a[] = new int[10];
	        int sum = 0;
	        System.out.println("Enter the 10 element in array");    
	        for(int i=0; i<10; i++){
	            a[i] = sc.nextInt();
	            sum += a[i];
	        }
	        float mean = sum/a.length;
	        System.out.println(mean);
	        System.out.println("List of student above mean");
	        for(int i=0; i<10; i++){
	            if(a[i] > mean){
	                System.out.println(a[i]);
	            }
	        }
	    }   
	}


