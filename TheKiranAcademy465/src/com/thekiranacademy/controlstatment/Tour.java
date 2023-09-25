package com.thekiranacademy.controlstatment;
import java.util.Scanner;
public class Tour {
	final int tcost=5000;
            void cost()
            {
            	Scanner sc=new Scanner(System.in);
            	System.out.println("Enter your destination");
            	String start=sc.next();
            	if (start.equals("Pune"))
            		System.out.println("Tour Cost="+tcost);
            	else if (start.equals("Dule"))
            		System.err.println("Tour Cost="+(tcost+300));
            	else if (start.equals("Beed"))
            		System.out.println("Tour Cost="+(tcost+200));
            	else 
            		System.out.println("Tour Destination only Pune/Dule/Beed");
            	
            }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Tour T=new Tour();
           T.cost();
	}

}
