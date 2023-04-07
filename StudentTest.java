package com.java;
	import java.util.*;
	public class StudentTest {
		    public static void main(String args[]){
		        Scanner sc=new Scanner(System.in);

		        System.out.println("Enter student 1 details");
		        float gp=sc.nextFloat();
		        float gp1=sc.nextFloat();
		        float gp2=sc.nextFloat();
		        float gp3=sc.nextFloat();
		        sc.nextLine();
		        String n1=sc.nextLine();
		        String r1=sc.nextLine();

		        System.out.println("Enter student 2 details");
		        float gpa=sc.nextFloat();
		        float gpa1=sc.nextFloat();
		        float gpa2=sc.nextFloat();
		        float gpa3=sc.nextFloat();
		        sc.nextLine();
		        String n2=sc.nextLine();
		        String r2=sc.nextLine();
		        
		        Student s1=new Student(n1,r1,gp,gp1,gp2,gp3);
		        Student s2=new Student(n2,r2,gpa,gpa1,gpa2,gpa3);

		        System.out.println("Student 1 details");
		        System.out.println("Name:"+s1.name);
		        System.out.println("Roll no:"+s1.rno);
		        System.out.println("CGPA:"+s1.cgpa());

		        System.out.println("Student 2 details");
		        System.out.println("Name:"+s2.name);
		        System.out.println("Roll no:"+s2.rno);
		        System.out.println("CGPA:"+s2.cgpa());
		    }
		}

