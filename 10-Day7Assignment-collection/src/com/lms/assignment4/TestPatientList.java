package com.lms.assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TestPatientList {

	/*public static int getPatientAge(String name, TreeSet<Patient> sortPatient) {
		if (sortPatient.contains(name)) {
			Iterator<Patient> ite=sortPatient.iterator();
			
		}
	}*/

	public static void main(String[] args) {
		// create array list object
		ArrayList<Patient> patientList = new ArrayList<>();
		// add 3 patient
		patientList.add(new Patient(101, "Rajkumar", 88));
		patientList.add(new Patient(101, "Vishwajeet", 48));
		patientList.add(new Patient(101, "Sivaditya", 35));
		// sort by name
		System.out.println("Sort by Name : ");
		Collections.sort(patientList);
		// dasplay patient after sorting by using for each loop
		for (Patient p : patientList) {
			System.out.print(p);
		}
		System.out.println();
		//sort by age
		System.out.println("Sort by Age : ");
		Collections.sort(patientList, new AgeComparator());
		//printing value by using iterator
		Iterator<Patient> ite=patientList.iterator();
		while(ite.hasNext()) {
			System.out.print(ite.next());
		}
		System.out.println();
		TreeSet<Patient> patientSet=new TreeSet<>(patientList);
		System.out.println(patientSet);
		//int age=getPatientAge("Rajkumar", patientSet);
		//System.out.println("Age :"+age);
	}

}
