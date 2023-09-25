
package com.thekiranacademy.array;
import java.util.Scanner;
public class SumofNo {
	static Scanner sc=new Scanner(System.in);
    int arr[]=new int[5];
    int sum=0;
    void setData()
    {
    	for(int i=0;i<5;i++)
    	{
    		System.out.println("Enter the array element");
    		arr[i]=sc.nextInt();
    		sum=sum+arr[i];
    	}
    }
    void putData()
    {
    	for(int i=0;i<5;i++)
    	{
    		System.out.println("array at position-"+i+"-"+arr[i]);
    	}
    	System.out.println("sum-"+sum);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         SumofNo s=new SumofNo();
         s.setData();
         s.putData();
	}

}
