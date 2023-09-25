package com.thekiranacadmy.collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class ArrayListNew {
	
	static Scanner sc=new Scanner(System.in);
	ArrayList<String> al=new ArrayList ();
	void add()
	{
		System.out.println("Enter the number of employee");
		int cnt =sc.nextInt();
		for(int i=0;i<5;i++)
		{
			System.out.println("ENter the empid");
			al.add(sc.next());
			System.out.println("ENter the empnm");
			al.add(sc.next());
			System.out.println("ENter the empsal");
			al.add(sc.next());
		}
	}
	void disp()
	{
		System.out.println(al);
		for(String obj:al)
			System.out.println(obj);
	
	}
	

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListNew  ad=new ArrayListNew ();
		ad.add();
		ad.disp();
		
	}

}
