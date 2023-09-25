package com.thekiranacadmy.collection;

public class Employee {



	
	private int empid;
	private float empsal;
	private String empnm;
	
	public Employee(int empid,float empsal,String empnm)
	{
		this.empid=empid;
		this.empnm=empnm;
		this.empsal=empsal;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empnm=" + empnm + ", empsal="+empsal+"]";
	}
}