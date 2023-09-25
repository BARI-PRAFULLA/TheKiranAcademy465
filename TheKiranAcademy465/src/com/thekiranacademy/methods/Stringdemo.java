package com.thekiranacademy.methods;
import  java.util.Scanner;
public class Stringdemo {
       static Scanner sc=new Scanner(System.in);
       void disp()
       {
    	   System.out.println("Enter a String"); 
    	   String str=sc.next();
    	   System.out.println("Enter charactor at a position 1="+str.charAt(2)); 
    	   System.out.println("Index of charactor="+str.indexOf('o')); 
    	   System.out.println("Uppercase="+str.toUpperCase()); 
    	   System.out.println("substring="+str.substring(2)); 
    	   System.out.println("substring="+str.substring(2,4)); 
    	   System.out.println("Enter another String"); 
    	   String str1=sc.next();
    			   
    	   if(str.equals(str1))
    		   
    	   System.out.println("Equal");
    	   else
    		   System.out.println("Not Equal");
    	   

       }
    	   
       
         
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Stringdemo d=new Stringdemo();
         d.disp();

	}}
