package com.collection.demo;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Saikat");
		al.add("Ram");
		al.add("Shyam");
		al.add("Pavan");
		al.add("Allu");

		ListIterator li = al.listIterator();
		while (li.hasNext()) {
			String name = (String) li.next();
			System.out.println(name.toUpperCase());
		}
		System.out.println("=============================");
		while (li.hasPrevious()) {
			String name = (String) li.previous();
			System.out.println(name.toUpperCase());
		}
		ArrayList<Integer> al1 = new ArrayList<>();
		for (int i = 0; i <= 10; i++) {
			al1.add(i);
		}
		System.out.println(al1);
		al1.remove(3);
		System.out.println(al1);
		al1.remove((Integer)7);
		System.out.println(al1);
		
		
		
	}

}
