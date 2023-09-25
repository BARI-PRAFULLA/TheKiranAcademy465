package com.thekiranacademy.methods;

public class Exercise {
       int a;
       float b;
       String str;
               
       void operation1() {
    	   a=10;
    	   b=50.4f;
    	   str="java";
    	   
       }
       void operation2() {
    	   a=20;
    	   b=25.6f;
    	   str="c++";
    	   
       }
       void display()
       {
    	   System.out.println("The integer value is="+a);
    	   System.out.println("The float value is="+b);
    	   System.out.println("The String value is="+str);
       }
       public static void main(String[] args)
       {
    	   Exercise E=new Exercise();
    	   E.operation1();
    	   E.display();
    	   E.operation2();
    	   E.display();
       }
}
