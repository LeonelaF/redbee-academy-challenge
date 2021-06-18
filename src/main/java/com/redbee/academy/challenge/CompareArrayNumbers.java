package com.redbee.academy.challenge;

import java.util.ArrayList;
import java.util.List;

public class CompareArrayNumbers {

  /**
   * Method that receives two lists and returns
   * another list with de max of each index
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @return The result of a + b
   */
  public static List<Integer> max(List<Integer> a, List<Integer> b) {
    //TODO: Implement me

	 if (a.size()==0 && b.size()==0) {
		 return null;
	 }
	 List<Integer> c= new ArrayList<Integer>();
	 if(a.size()<b.size()) {
		 for (int i=0; i<a.size();i++) {
			  c.add( Math.max(a.get(i), b.get(i)));
		 }
		 for(int i=a.size();i<b.size();i++) {
			 c.add(b.get(i));
		 }
	 }
	if(a.size()>b.size()) {
		for (int i=0; i<b.size();i++) {
			c.add( Math.max(a.get(i), b.get(i)));
		 }
		for(int i=b.size();i<a.size();i++) {
				 c.add(a.get(i));
			 }
	}
	else {
		for (int i=0; i<a.size();i++) {
			c.add(Math.max(a.get(i), b.get(i)));
	  }
	}
	return c;
  }
}
