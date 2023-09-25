package com.thekiranacademy.controlstatment;
import java.util.Scanner;

import com.thekiranacademy.methods.bill;
public class Bill {
	void bill_disp() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amt");
		int amt=sc.nextInt();
		System.out.println("Enter the code");
		String ccode=sc.next();
		if (amt>1000 && ccode.startsWith("P"))
			System.out.println("you get dicount 30%");
		else if
		((amt>500 && amt<1000) && ccode.startsWith("P"))
				System.out.println("you get discount 20%");
		else 
			System.out.println("you get discount 10%");
		sc.close();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bill b=new Bill();
		b.bill_disp();
	}
		
          

}
