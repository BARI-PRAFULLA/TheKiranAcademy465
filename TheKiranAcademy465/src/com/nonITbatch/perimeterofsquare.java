package com.nonITbatch;
import java.util.Scanner;
public class perimeterofsquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		       Scanner sc=new Scanner(System.in);
		       
		   
	
        
	           System.out.println("Enter length  of the Rectangle:");
	           double l=sc.nextDouble();
	           System.out.println("Enter wide25  of the Rectangle:");
	           double w=sc.nextDouble();
	           
	           double perimeter1=2*(l+w);
	           
	           System.out.println("perimeter of Rectangle of is:"+perimeter1);
     
	          
	       	
	           
	           System.out.println("Enter radius of the trangle:");
	           double a1=sc.nextDouble();
	           System.out.println("Enter radius of the trangle:");
	           double b2=sc.nextDouble();
	           System.out.println("Enter radius of the trangle:");
	           double c3=sc.nextDouble();
	           
	           double perimeter2=a1+b2+c3;
	           
	           System.out.println("perimeter of trangle is:"+perimeter2);
     
	           System.out.println("Enter radius of the circle:");
	           double r=sc.nextDouble();
	           
	           
	           double perimeter3=2*3.14*r;
	           
	           System.out.println("perimeter of circle of is:"+perimeter3);
}
}