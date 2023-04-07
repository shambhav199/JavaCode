package com.java;

import java.util.Scanner;

public class ROUGH {
	public static void main(String arg[]) { 
		double PA ,ROI,TP;
		Scanner sc = new Scanner(System.in);
		System.out.println("Principal Amount:");
		PA =sc.nextDouble();
		System.out.println("ROI:");
		ROI =sc.nextDouble();
		System.out.println("Time Period:");
		TP =sc.nextDouble();
		
		copInt(PA,ROI,TP);
		
		 }  
	public static void copInt(double PA, double ROI, double TP)
	{
		double FutureCI, CI;
		FutureCI = PA * (Math.pow(( 1 + ROI/100), TP));
		CI = FutureCI - PA;
		
		System.out.println("\n Future for " + PA + " is = " + FutureCI);
		System.out.println(" Actual for " + PA + " is = " + CI);
	}

}
	  
        