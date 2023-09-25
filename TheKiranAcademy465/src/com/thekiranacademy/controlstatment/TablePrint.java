package com.thekiranacademy.controlstatment;
import java.util.Scanner;
public class TablePrint {
	  
	void disp()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		 int no=sc.nextInt();
		 System.out.println("enter a no till which the table needs to be printed");
		 int no1=sc.nextInt();
		 int i=1;
		 while (i<=no1)
		 {
			System.out.println(i*no);
			 i++;
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         TablePrint TP=new TablePrint();
         TP.disp();
	}

}
