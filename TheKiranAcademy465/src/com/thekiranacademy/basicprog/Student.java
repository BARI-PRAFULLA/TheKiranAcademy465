package com.thekiranacademy.basicprog;
import java.util.Scanner;
public class Student {
               int studid;
               String studnm,studcourse;
                  void setData()
                  {
                	  Scanner sc=new Scanner(System.in);
                	  System.out.println("Enter studid");
                	  studid=sc.nextInt();
                	  System.out.println("Enter studnm");
                	  studnm=sc.next();
                	  System.out.println("Enter studcourse");
                	  studcourse=sc.next();
                	  
                  }
                  void getData()
                  {
                	  System.out.println("studid="+studid);
                	  System.out.println("studnm="+studnm);
                	  System.err.println("studcourse="+studcourse);
                  }
                         
                         
                         
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.setData();
		s.getData();
            

	}}
