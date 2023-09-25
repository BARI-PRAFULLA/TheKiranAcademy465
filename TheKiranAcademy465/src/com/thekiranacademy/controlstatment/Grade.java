package com.thekiranacademy.controlstatment;
import java.util.Scanner;
public class Grade {
         char g;
            void accept()
            {
            	Scanner sc=new Scanner(System.in);
            	System.out.println("Enter the grade");
            	 g=sc.next().charAt(0);
            	 switch (g)
            	 {
            	 case 'A': 
            	 {
            		 System.out.println("you have excellent performance");
            		break;
            	 }
            	 case 'B':
            	 {
            	 System.out.println("you have good performance");
            	 break;
            	 }
            	 case 'C':
            	 {
            	 System.out.println("you have try hard performance");
            	 break;
            	 }
            	 default:
            		 
            			 System.out.println("please enter A/B/C grade");
            			 }
            		 
            		 
            		 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                       Grade G=new Grade();
                       G.accept();
	}

}
