package com.java;


	import java.util.*;
	public class binary {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the binary number:");
	String b_num = sc.next();
	int d_num = 0;
	int temp;
	int ki=0;
	int o_num = 0;
	String h_num =" ";
	int len = b_num.length();
	for(int i = len - 1, j=0; i>=0;j++,i--){
	if(b_num.charAt(i) == '1'){
	d_num = d_num + (int)Math.pow(2, j);
	}
	}
	for(int i = len; i>0;i-=3,ki++){
	String s_sub = b_num.substring(i-3 > 0 ? i-3 : 0,i);
	temp = 0;
	for(int k=s_sub.length()-1, j=0;k >=0;k--,j++){
	if(s_sub.charAt(k) == '1'){
	temp = temp + (int)Math.pow(2, j);
	}
	}
	o_num = o_num + (temp * (int)Math.pow(10, ki));
	}
	ki=0;
	for(int i = len; i>0;i-=4,ki++){
	String s_sub = b_num.substring(i-4 > 0 ? i-4 : 0,i);
	temp = 0;
	for(int k=s_sub.length()-1, j=0;k>=0;k--,j++){
	if(s_sub.charAt(k) == '1'){
	temp = temp + (int)Math.pow(2, j);
	}
	}
	if(temp>9){
	char c = (char)(55+temp);
	h_num = c + h_num;

	}
	else
	h_num = String.valueOf(temp) + h_num;
	}
	System.out.println("Decimal Number: "+d_num);
	System.out.println("Octal Number:"+o_num);
	System.out.println("Hexadecimal Number:"+h_num);
	}
	}
