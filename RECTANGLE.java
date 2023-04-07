package com.java;

import java.util.Scanner;
public class RECTANGLE {
	double length ,width,area;
	String colour;
	Scanner sc=new Scanner(System.in);
	
	void get_length() {
	System.out.println("Enter length:");
    length = sc.nextDouble();
	}
	
	void get_width() 
	{
    System.out.println("Enter width:");
    width = sc.nextDouble();
	}
	
	void get_colour() 
	{
    System.out.println("Enter colour:");
    colour = sc.next();
	}

	double find_area() 
	{
    return(length*width);
	}
	
}
	
