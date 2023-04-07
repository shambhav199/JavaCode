package com.java;

public class enmu {

		   enum TrafficLight{   
		    RED(54), YELLOW(19), GREEN(8);

		        private int value;  
		        private TrafficLight(int value){  
		            this.value=value;  
		        }  
		    }  
		    public static void main(String args[]){  
		    System.out.println("Light Duration");  
		    for (TrafficLight s : TrafficLight.values())  
		    System.out.println(s+" "+s.value);  

		    }
		    
		}
