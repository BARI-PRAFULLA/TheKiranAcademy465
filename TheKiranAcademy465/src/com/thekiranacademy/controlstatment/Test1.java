package com.thekiranacademy.controlstatment;
import java.util.Scanner;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		Scanner sc=new Scanner(System.in);
		int opt=1;
		do
		{
			
		
		System.out.println("Enter the choice");
		System.out.println("1.Area");
		System.out.println("2.OddEven");
		System.out.println("3.Average");
		System.out.println("4.Exit");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
		{
			Area A=new Area();
			System.out.println("Enter length");
			int l=sc.nextInt();
			System.out.println("Enter breath");
			int b=sc.nextInt();
			A.area_rect(l,b);
			break;
			
		}
		case 2:
		{
			OddEven2 O2=new OddEven2();
			System.out.println("Enter a no");
			int no=sc.nextInt();
			O2.check(no);
			break;
		}
		case 3:
		{
			Average av=new Average();
			av.avg();
			break;
		}
		case 4:
		{
			System.exit(0);
		}
		default:
			System.out.println("Enter option between 1 to 4");
		}
		
		
		System.out.println("To continew press 1 or exit 0");
        opt=sc.nextInt();
        sc.close();
	}
	while(opt==1);
	}
	}


