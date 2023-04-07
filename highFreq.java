package com.java;

	import java.util.Scanner;
	public class highFreq {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int num,freq,orFreq =0,orNum =0;
	        int a[] = new int[5];
	        System.out.println("Enter the 5 element in array");    
	        for(int i=0; i<5; i++){
	            a[i] = sc.nextInt();
	        }
	        for(int i=0; i<5; i++){
	            for(int j=i; j<5; j++){
	                if(a[i] < a[j]){
	                    int temp = a[i];
	                    a[i] = a[j];
	                    a[j] = temp;
	                }
	            }
	        }
	        num =a[0];
	        freq = 1;
	        for(int i=1; i<5; i++){
	            if(num == a[i]){ freq++; }
	            else{
	                orNum = num;
	                orFreq = freq;
	                num = a[i];
	                freq =1;
	            }
	        }
	        if(orFreq > freq) { System.out.println("Highest Frequency: "+orNum); }
	        else { System.out.println("Highest Frequency: "+num); }
	    }   
}
