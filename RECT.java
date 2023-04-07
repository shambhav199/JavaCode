package com.java;
public class RECT 
{
		public static void main(String []args) 
		{
			double a1,a2;
			RECTANGLE r1=new RECTANGLE();
			RECTANGLE r2=new RECTANGLE();
			r1.get_length();
			r1.get_width();
			r1.get_colour();
			r2.get_length();
			r2.get_width();
			r2.get_colour();
			a1=r1.find_area();
			a2=r2.find_area();
			if(a1==a2 && r1.colour.equals(r2.colour)) {
				System.out.println("Matching Rectangles");
			}
				else {
					System.out.println("Non Matching Rectangles");
					
				}
			}
}
