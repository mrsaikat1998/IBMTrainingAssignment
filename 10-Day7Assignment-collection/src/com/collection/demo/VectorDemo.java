package com.collection.demo;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		//create Vector object
		Vector<Object> v=new Vector<>();
		//adding operation 
		v.add("A");
		v.add("B");
		v.add("A");
		v.add("D");
		v.add("B");
		v.add("E");
		v.add("A");
		v.add("I");
		v.add("K");
		//counting operation
		System.out.println("Elements Present : "+v.size());
		//printing Operation
		System.out.println(v);
		//searching operation
		/*System.out.println("Present or Not : "+v.contains("I"));
		System.out.println(v.indexOf("I"));*/
		
		//removing operation
		if(v.contains("B")) {
			v.remove("B");
		}
		
		v.remove(v.lastIndexOf("A"));
		System.out.println(v);
		//retriving operation
		System.out.println(v.get(4));
		
		//using for loop, enhanced for loop, iterator
		for(Object o: v) {
			System.out.println(o);
		}

	}

}
