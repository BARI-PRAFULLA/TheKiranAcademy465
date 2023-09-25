package com.thekiranacademy.methods;
  import java.util.Scanner;
public class faculty {
          int facid;
          String facnm; static
          Scanner sc=new Scanner(System.in);
           void setData()
           {
        	  
        	   System.out.println("Enter facid");
        	   facid=sc.nextInt();
        	   System.out.println("Enter facnm");
        	   facnm=sc.next();
           }
           void getData()
           {
        	   System.out.println("studid="+facid);
        	   System.out.println("facnm="+facnm);
        	   
        	   
        			   
           }
}
