package com.collection.employee;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TestEmployeeDetails {

	public static void main(String[] args) {
		Map<Integer, Employee> empList = new TreeMap<>();
		empList.put(1, new Employee(101, "Mr Rahul", "Finance", 4500));
		empList.put(2, new Employee(102, "Kumar Gupta", "Sales", 4500));
		empList.put(3, new Employee(103, "Ram Kumar", "Manager", 4500));
		empList.put(4, new Employee(104, "Tarun Das", "Businee", 4500));
		empList.put(5, new Employee(105, "Pk Roy", "Sales", 4500));

		Iterator<Map.Entry<Integer, Employee>> ite = empList.entrySet().iterator();

		while (ite.hasNext()) {
			Map.Entry<Integer, Employee> entry = ite.next();
			System.out.println(entry.getKey() + "  -  " + entry.getValue());
		}
		System.out.println();

		// by using TreeSet
		Set<Employee> empSet = new TreeSet<>();
		empSet.add(new Employee(101, "Mr Rahul", "Finance", 4500));
		empSet.add(new Employee(102, "Kumar Gupta", "Sales", 4500));
		empSet.add(new Employee(103, "Ram Kumar", "Manager", 4500));
		empSet.add(new Employee(104, "Tarun Das", "Businee", 4500));
		empSet.add(new Employee(105, "Pk Roy", "Sales", 4500));

		Iterator<Employee> itr = empSet.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
