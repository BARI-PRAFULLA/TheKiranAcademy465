package com.thekiranacademy.controlstatment;
import java.util.Scanner;
public class Purchase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice");
        System.out.println("1.Mobile");
        System.out.println("2.Laptop");
        System.out.println("3.Smartwatch");
        System.out.println("4.Exit");
       
         int ch=sc.nextInt();
         switch (ch)
         {
         case 1:
         {
        	 Mobile2 M2=new Mobile2();
        	 System.out.println("Enter the qty");
        	 int qty=sc.nextInt();
        	 M2.mbill(qty);
        	 break;
         }
         case 2:
         {
        	 Laptop2 L2=new Laptop2();
        	 System.out.println("Enter the qty");
        	 int qty=sc.nextInt();
        	 L2.lbill(qty);
        	 break;
         }
         case 3:
         {
        	 Smartwatch2 S2=new Smartwatch2();
        	 System.out.println("Enter the qty");
        	 int qty=sc.nextInt();
        	 S2.sbill(qty);
        	 break;
        	 
         }
         default :
        	 System.out.println("Enter only ");
         }
        
	}

}
