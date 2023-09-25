package com.thekiranacademy.methods;
import java.util.Scanner;
public class StringBufferMethod {
	static Scanner sc=new Scanner(System.in);
                      
						void disp()
                            {
                            	System.out.println("enter a string");
                            	StringBuffer sb=new StringBuffer(sc.next());
                            	
                            	System.out.println("Capacity="+sb.capacity());
                            	System.out.println("Length="+sb.length());
                            	System.out.println("Append-"+sb.append("for java"));
                            	System.out.println("insert-"+sb.insert(1, 'T'));
                            	System.out.println("Delete-"+sb.deleteCharAt(1));
                            	System.out.println("Replace-"+sb.replace(0, 1, "TT"));
                            	System.out.println("Reverse-"+sb.reverse());
                            	System.out.println("Capacity="+sb.capacity());
                            	System.out.println("Length="+sb.length());
                            	
   
                            }	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBufferMethod sbf=new StringBufferMethod();
		sbf.disp();
	}

}
