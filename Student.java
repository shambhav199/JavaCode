package com.java;
import java.util.*;

public class Student {
    String name;String rno;float gpa;float gpa1;float gpa2;float gpa3;
    Student(String name,String rno,float gpa,float gpa1,float gpa2,float gpa3){
        this.name=name;
        this.rno=rno;
        this.gpa=gpa;
        this.gpa1=gpa1;
        this.gpa2=gpa2;
        this.gpa3=gpa3;
    }
    float cgpa(){
        return((gpa+gpa1+gpa2+gpa3)/4);
    }
}

