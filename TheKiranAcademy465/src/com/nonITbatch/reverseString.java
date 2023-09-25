package com.nonITbatch;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		
		  String stroriginal = "hello world";
		  
		  System.out.println("original :"+  stroriginal);
		  
		  stroriginal =new StringBuffer(stroriginal).reverse().toString();
		  
		  System.out.println("Reverse :"+  stroriginal);
		
		
	}

}
