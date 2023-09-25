package com.thekiranacademy.controlstatment;
import java.util.Scanner;
public class Average {
         
	void avg()
	{
		Scanner sc=new Scanner(System.in);
		int no,s=0,avg;
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter a no");
			no=sc.nextInt();
			s=s+no;
			
		}
		System.out.println("average="+(s/5));
		sc.close();
		}
	  
} 
