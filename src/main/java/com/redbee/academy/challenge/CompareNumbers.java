package com.redbee.academy.challenge;

public class CompareNumbers {

  /**
   * Method that receives two numbers and returns the
   * max of both
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @param c - Another Integer Number
   * @return The max of a, b and c
   */
  public static Integer max(Integer a, Integer b, Integer c) {
    //TODO: Implement me
	  if (a==null && b==null && c==null) {
          return null;
      }
      if (a!=null && b!=null && c!=null) {
          return Math.max(Math.max(a, b), c);
      }
      int m=0;
      if (a!=null) {
          if (b!=null && c==null) {
          m= Math.max(a,b);
          }
      }
      if (b!=null) {
          if (c!=null) {
          m= Math.max(b,c);
          }
          else {
              m=b;
          }
      }
      return m;
 }
} 
