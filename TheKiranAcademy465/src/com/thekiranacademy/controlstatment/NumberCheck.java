package com.thekiranacademy.controlstatment;
import java.util.Scanner;
public class NumberCheck {
	   
	void check(int no)
	{
		if (no>0)
		{
			System.out.println("No="+no);
			System.out.println("it is a positive no");
		}
		
		else if(no<0) {
			System.out.println("No="+no);
			System.out.println("it is negative no");
		}
		else {
			System.out.println("its a zero");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           NumberCheck n=new NumberCheck();
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the no");
           int no=sc.nextInt();
           n.check(no);
           
	}

}
