package com.thekiranacademy.methods;
import java.util.Scanner;
public class student {
             int studid;
             String studnm,studcourse;
       static Scanner sc=new Scanner(System.in);
             void setData()
             {
            	 
            	 System.out.println("Enter studid");
            	 studid=sc.nextInt();
            	 System.out.println("Enter studnm");
            	 studnm=sc.next();
            	 System.out.println("Enter studcourse");
            	 studcourse=sc.next();
             }
            	 
            	 
            	 void putData()
            	 {
            		 System.out.println("studid="+studid);
            		 System.out.println("studnm="+studnm);
            		 System.out.println("studcourse="+studcourse);
            		 
            	 }
            	 
            	 
             }

