package com.java;
import java.util.Scanner;
public class CBSECALCULATOR {
	

		public static void main (String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Total marks of a subject: ");
			int totalmarks=sc.nextInt();
			totalmarks=totalmarks*5;
			System.out.println("subject1: ");
			float s1=sc.nextFloat();
			System.out.println("subject2: ");
			float s2=sc.nextFloat();
			System.out.println("subject3: ");
			float s3=sc.nextFloat();
			System.out.println("subject4: ");
			float s4=sc.nextFloat();
			System.out.println("subject5: ");
			float s5=sc.nextFloat();
			float percentage=(s1+s2+s3+s4+s5)/totalmarks*100;
			System.out.println(percentage);
		

		}


}
