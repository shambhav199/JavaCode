package com.java;

public class highskl {
		public static void main(String[] args) {
		teacher t = new teacher();
		t.set_name("shreya");
		t.set_salary(57000);
		t.set_subject("eng");
		Cstud s = new Cstud();
		s.set_name("arunima");
		s.set_year(2012);
		s.set_major("phy");
		System.out.println("Teacher--- Name: "+t.get_name()+     " Salary: "+t.get_salary() +
		                 "Subject: "+t.get_subject());
		System.out.println("Student--- Name: "+s.get_name()+     " Year: "+s.get_year()+
	                   "Major: "+s.get_major());
		}
		}
