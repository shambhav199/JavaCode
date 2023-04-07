package com.java;

	import java.util.*;
	public class rectngle {
	    Scanner sc = new Scanner(System.in);
	    private double length,width;
	    rectngle(){
	        this.length = 1.0;
	        this.width = 1.0;
	    }
	    void set_length(){
	        while(true){
	            System.out.println("Enter the length");
	            double len = sc.nextDouble();
	            if(len > 0.0 && len < 20.0){
	                this.length = len;
	                break;
	            }
	        } 
	    }
	    void set_width(){
	        while(true){
	            System.out.println("Enter the width");
	            double wid = sc.nextDouble();
	            if(wid > 0.0 && wid < 20.0){
	                this.width = wid;
	                break;
	            }
	        } 
	    }
	    double get_length(){
	        return this.length;
	    }
	    double get_width(){
	        return this.width;
	    }
	    double perimeter(){
	        return 2*(this.length + this.width);
	    }
	    double area(){
	        return (this.length * this.width);
	    }
	    
	}
