package com.thekiranacademy.methods;

public class Student2 {
	  int studid;
	  String studnm;
	  static int batchcode;
	  
	  void setData(int studid,String studnm)
	  {
		  this.studid=studid;
		  this.studnm=studnm;
	  }
	  static void setbatch()
	  {
		  batchcode=576;
	  }
	  void disp()
	  {
		  System.out.println(studid);
		  System.out.println(studnm);
	  }
	  static void dispb()
	  {
		  System.out.println(batchcode);
	  }
	  

}
