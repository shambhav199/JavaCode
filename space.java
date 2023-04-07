package com.java;


	import java.util.*;
	public class space {
	public static void main(String[] args) {
	int i;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the five digit number");
	String num = sc.next();
	if(num.length() == 5){
	for(i=0; i<num.length();i++){
	System.out.print(num.charAt(i)+" ");
	}
	}
	else{
	System.out.println("Entered number is not 5 digit");
	}
	}
	}
