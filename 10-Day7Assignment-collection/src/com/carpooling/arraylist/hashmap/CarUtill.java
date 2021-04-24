package com.carpooling.arraylist.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CarUtill {
	
	public static HashMap<String,MemberCar> groupByColor(List carList,List memberList,List memberCarList) {
		Map<String,MemberCar> map=new HashMap();
		for(int i=0;i<memberCarList.size();i++) {
			MemberCar m1 =(MemberCar) memberCarList.get(i);
			String color=m1.getColor().toUpperCase();
			map.put(color, m1);
		}
		return (HashMap) map;
	}

	public static void main(String[] args) {
		List<Car> carList = new ArrayList<>();
		carList.add(new Car("i10", "sports", 2007, "Hyundai", 8));
		carList.add(new Car("alto", "kx1", 2008, "Maruti", 6));
		carList.add(new Car("polo", "topline", 2010, "Volks", 5));
		carList.add(new Car("kwid", "lxi", 2010, "Renault", 5));
		List<Member> memberList = new ArrayList<>();
		memberList.add(new Member("Joe", "Root", "joe.root@a.com", "1234567890", "AH1", "12-12-2001", "12-12-2010"));
		memberList.add(new Member("Ben", "Stokes", "ben.stokes@a.com", "2345678901", "AH2", "12-12-2002", "12-12-2011"));
		memberList.add(new Member("Virat", "Kohali", "virat.kohali@a.com", "3456789021", "AH3", "12-12-2003", "12-12-2013"));
		List<MemberCar> memberCarList=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Car Colour");
		String color=sc.next().toUpperCase();
		System.out.println("Enter Number Of Member Cars : ");
		int numberOfMemberCars=sc.nextInt();
		System.out.println("Enter the "+numberOfMemberCars+" Member Car Details : <id-long, member no-int(1-3), car no-int(1-4),registration no-String, color-String> : ");
		for(int i=0;i<numberOfMemberCars;i++) {
			long id=sc.nextLong();
			int memberNo=sc.nextInt();
			int carNo=sc.nextInt();
			sc.nextLine();
			String registrationNo=sc.next();
			String carColor=sc.next().toUpperCase();
			memberCarList.add(new MemberCar(id, memberList.get(memberNo-1), carList.get(carNo-1), registrationNo, carColor));
		}
		
		HashMap hm=groupByColor(carList, memberList, memberCarList);
		MemberCar mem1=(MemberCar) hm.get(color);
		System.out.println(mem1.getCarRegistration());
	}

}
