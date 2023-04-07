package com.java;

import java.util.Arrays;
import java.util.Scanner;
//import java.util.Scanner;

public class ARRAYS {
	
	public static void main (String[]args) {
		int age = 30;
	    int pyhsics = 87;
		int chem = 89;
		int maths = 97;
		
		int marks[] = new int [3];
		
		marks [0] = 87;
		marks [1] = 89;
		marks [2] = 97;
		
		System.out.println(marks[1]);
		
		
		
		//length
		System.out.println(marks.length);
		
		
		//sorting
		Arrays.sort(marks);
		System.out.println(marks[0]);
		
		
		//2D arrays
		int[][] finalmarks = {{76 , 68 , 68}  , {89 , 79 , 67}};
		
		System.out.println(finalmarks[1][2]);
				
	}
}
