package com.redbee.academy.challenge;

public class SumTwoNumbers {

  /**
   * Method that receives two numbers and returns the
   * sum of both
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @return The result of a + b
   */
  public static Integer sum(Integer a, Integer b) {
    //TODO: Implement m
	  int s=0;
	  if(a==null) {
		  s=b;
	  }
	  if(b==null) {
		  s=a;
	  }
	  if (a!=null && b!=null){
		  s=a+b;
	  }
    return s;
  }
}
