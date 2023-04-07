package com.java;

public class emp_detail {

	    public static void main(String[] args) { 

	        System.out.println("Employee 1:"); 

	        emp1 e1 = new emp1(); 

	        System.out.println("Employee 2:"); 

	        emp1 e2 = new emp1(); 

	        System.out.println("------------------------------------"); 

	        emp1 detail1 = e1.getter(); 

	        emp1 detail2 = e2.getter(); 

	        System.out.println("Employee 1:"); 

	        System.out.println("First Name\tLast Name\tYearly Salary"); 

	        System.out.println(detail1.first_name+"\t"+detail1.last_name+"\t"+detail1.salary * 12); 

	        System.out.println("Employee 2:"); 

	        System.out.println("First Name\tLast Name\tYearly Salary"); 

	        System.out.println(detail2.first_name+"\t"+detail2.last_name+"\t"+detail2.salary * 12); 

	        System.out.println("------------------------------------"); 

	        e1.setter(e1.salary); 

	        e2.setter(e2.salary); 

	        emp1 ndetail1 = e1.getter(); 

	        emp1 ndetail2 = e2.getter(); 

	        System.out.println("Employee 1:"); 

	        System.out.println("First Name\tLast Name\tYearly Salary"); 

	        System.out.println(ndetail1.first_name+"\t"+ndetail1.last_name+"\t"+ndetail1.salary * 12); 

	        System.out.println("Employee 2:"); 

	        System.out.println("First Name\tLast Name\tYearly Salary"); 

	        System.out.println(ndetail2.first_name+"\t"+ndetail2.last_name+"\t"+ndetail2.salary * 12); 

}
}
