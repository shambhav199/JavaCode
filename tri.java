package com.java;
	import java.util.*;
	public class tri
	{
	public static void main(String args[])
	{
	double t;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the three sides of a triangle");
	double s[]=new double[3];
	for(int i=0;i<3;i++)
	{
	s[i]=sc.nextDouble();
	}
	for(int i=0;i<2;i++)
	{
	for(int j=0;j<2;j++)
	{
	if(s[j]<s[j+1])
	{
	t=s[j];
	s[j]=s[j+1];
	s[j+1]=t;
	}
	}
	}
	if((s[1]+s[2])<=s[0])
	{
	System.out.println("Triangle not possible");
	}
	else
	System.out.println("Triangle possible");
	}
	}

