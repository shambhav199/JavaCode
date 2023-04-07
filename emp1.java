package com.java;


	import java.util.Scanner; 
	public class emp1 {

	    String first_name,last_name; 

	    double salary; 

	    Scanner sc = new Scanner(System.in); 

	    emp1(){ 

	        System.out.println("Enter the First Name"); 

	        this.first_name = sc.nextLine(); 

	        System.out.println("Enter the Last Name"); 

	        this.last_name = sc.nextLine(); 

	        System.out.println("Enter the Salary"); 

	        this.salary = sc.nextDouble(); 

	        if(this.salary < 0){ 

	            this.salary=0.0; 

	        } 

	    } 

	    void setter(double sal){ 

	       System.out.println(this.salary); 

	       this.salary = sal+((sal * 10)/100); 

	       System.out.println(this.salary); 

	    } 

	    emp1 getter(){ 

	        return this; 

	    } 

	} 

	 

	 

	
