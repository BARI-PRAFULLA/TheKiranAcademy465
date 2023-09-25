package com.thekiranacademy.controlstatment;
import java.util.Scanner;

public class Percentage {
         
	    void grade()
	    {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the per");
	    	int per=sc.nextInt();
	    if (per>90 )
	    	System.out.println("you get grade A++");
	    else if (per>75 && per<90)
	    	System.out.println("you get grade A+");
	    else if (per>60 && per<75)
	    	System.out.println("you get grade A");
	    else if (per>45 && per<60)
	    	System.out.println("you get grade B");
	    if (per<45 )
	    	System.out.println("you get grade C");
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Percentage P=new Percentage();
		P.grade();

	}

}
