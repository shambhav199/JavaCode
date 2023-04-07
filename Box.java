package com.java;

public class Box {
		double width,depth,height;
		Box(double width,double depth,double height){
		this.width = width;
		this.depth = depth;
		this.height = height;
		}
		double volume(){
		return (this.height * this.depth * this.width);
		}
		}
		
