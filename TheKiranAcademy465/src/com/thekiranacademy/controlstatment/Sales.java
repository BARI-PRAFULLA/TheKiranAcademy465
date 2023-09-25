package com.thekiranacademy.controlstatment;
import java.util.Scanner;
public class Sales {
	       
	void totalsale()
	{
		Scanner sc=new Scanner(System.in);
		int amt,total=0;
		for (int i=1;i<=5;i++)
		{
		System.out.println("Enter the sales amt");
		
		amt=sc.nextInt();
		total=total+amt;
	}
	System.out.println("Total="+total);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Sales s=new Sales();
             s.totalsale();
	}

}
