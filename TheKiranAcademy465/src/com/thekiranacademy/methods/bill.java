package com.thekiranacademy.methods;
import java.util.Scanner;


public class bill
{
    final int price=190;
    void billcal(int qty)
    {
    	int amt=qty*price;
    	System.out.println("bamt="+amt);
    	
    	 
    	 
     
          }
	public static void main(String[] args) {
		 // TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the amt");
	bill b=new bill();
	int qty=sc.nextInt();
	b.billcal(qty);
	}}
	