package com.thekiranacademy.controlstatment;
import java.util.Scanner;

public class User1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
         System.out.println("Enter the Choice");
         System.out.println("1.OddEven");
         System.out.println("2.Percentage");
         System.out.println("3.NumberCheck");
         System.out.println("4.Exit");
           
         int choice=sc.nextInt();
         switch (choice)
         {
         case 1:
         {
        	 OddEven2 oe=new OddEven2();
        	 System.out.println("Enter a no");
        	 int no=sc.nextInt();
        	 oe.check(no);
        	 break;
         }
         case 2:
         {
        	 Percentage2 p2=new Percentage2();
        	 System.out.println("Enter a per");
        	 int per=sc.nextInt();
        	 p2.check(per);
        	 break;
         }
         case 3:
         {
        	 NumberCheck2 N2=new NumberCheck2();
        	 System.out.println("Enter a no");
        	 int no=sc.nextInt();
        	 N2.check(no);
        	 break;
         }
         case 4:
         {
        	 System.exit(0);
         }
         default :
         
         System.out.println("Enter option between 1 to 4 ");
         }
	}
	}


