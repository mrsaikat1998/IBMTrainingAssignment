package com.collection.demo;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		//create HashSet object
		HashSet<Object> hs=new HashSet<>();
		//add some element
		for(int i=1000;i<=1020;i++) {
			hs.add(i);
		}
		//counting operation
		System.out.println("Hs Size : "+hs.size());
		//print all object but it not maintain insertion order
		System.out.println(hs);
		//perform searching operation
		System.out.println(hs.contains(1000));
		//remove operation
		hs.remove(1000);
		System.out.println(hs);
	}

}
