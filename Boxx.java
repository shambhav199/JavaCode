package com.java;


	import java.util.Scanner;
	public class Boxx {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the width, depth and height of Box:");
	Box b1 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
	System.out.println("Volume of box: "+b1.volume());

}

}
