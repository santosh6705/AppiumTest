package com.vodafone.basics;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;

public class DataInputOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a =11.111111111111f;
		System.out.println(a);

		String k="hello";
		System.out.println(k.equals("hello"));
		String b =k.substring(2,3);
		System.out.println(b);

		int[] c ={1,2,3,4,5,6,7};
		System.out.println(c[2]);
		//char [] d={'a','b'};

		/*ArrayList<Integer> L = new ArrayList<Integer>();
L.add(1);
L.add(2);
L.add(3);
L.remove(2);
System.out.println(L.get(1));*/

		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"two");
		System.out.println(hm.get(1));



	}

}