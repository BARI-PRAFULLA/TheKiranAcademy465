package com.thekiranacademy.controlstatment;
import java.util.Scanner;
public class VowelCheck {
	char ch;
           void accept()
           {
        	   Scanner sc=new Scanner(System.in);
        	   System.out.println("Enter the Charactor");
        	   ch=sc.next().charAt(0);
        	   
        	   switch (ch)
        	   {
        	   case 'A':
        	   case 'a':
        		   System.out.println("vowel");
        		   break;
        	   case 'E':
        	   case 'e':
        		   System.out.println("vowel");
        		   break;
        	   case 'I':
        	   case 'i':
        		   System.out.println("vowel");
        		   break;
        	   case 'O':
        	   case 'o':
        		   System.out.println("vowel");
        		   break;
        	   case 'U':
        	   case 'u':
        		   System.out.println("vowel");
        		   default :
        			   System.out.println("It is not a vowel");
        		   
        	   }
        	   
           }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
                    VowelCheck vc=new VowelCheck();
                    vc.accept();
	}

}
