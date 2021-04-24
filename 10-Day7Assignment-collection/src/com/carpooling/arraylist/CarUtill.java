package com.carpooling.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarUtill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Car car = new Car();
		Member member = new Member();
		List<MemberCar> memberCarList = new ArrayList<>();
		boolean wizard = true;
		do {
			System.out.println("1---> Add a Member ");
			System.out.println("2---> Add a Car ");
			System.out.println("3---> Assign Car to Member ");
			System.out.println("4---> Cars Owned ");
			System.out.println("5---> exit ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Member Id : ");
				int memberId = sc.nextInt();
				System.out.println("First Name : ");
				String firstName = sc.next();
				System.out.println("Last Name : ");
				String lastName = sc.next();
				System.out.println("Email ID : ");
				String email = sc.next();
				System.out.println("Mobile No : ");
				String mobile = sc.next();
				System.out.println("Registration ID : ");
				String registrationId = sc.next();
				System.out.println("Registration Start Date : ");
				String registrationStartDate = sc.next();
				System.out.println("Registration End Date : ");
				String registrationEndDate = sc.next();
				member.setMemberList(new Member(memberId, firstName, lastName, email, mobile, registrationId,
						registrationStartDate, registrationEndDate));
				break;
			case 2:
				System.out.println("ID(long) :");
				long id = sc.nextLong();
				System.out.println("Car Name :");
				String carName = sc.next();
				System.out.println("Model :");
				String carModel = sc.next();
				System.out.println("Make Year(int) :");
				int year = sc.nextInt();
				System.out.println("Company :");
				String company = sc.next();
				System.out.println("Comfort Level(int) :");
				int comfortlevel = sc.nextInt();
				car.setCarList(new Car(id, carName, carModel, year, company, comfortlevel));
				break;
			case 3:
				System.out.println("Member Car Id : ");
				int carId = sc.nextInt();
				System.out.println("Member Id : ");
				int memberId1 = sc.nextInt();
				System.out.println("Car Id :");
				int carId1 = sc.nextInt();
				System.out.println("Car Registration : ");
				String carReg = sc.next();
				System.out.println("Car Colour : ");
				String carColor = sc.next();
				List carList = member.getMemberList();
				int assignCar = 0;
				for (int i = 0; i < carList.size(); i++) {
					Car car1 = (Car) carList.get(i);
					long id1 = car1.getId();
					if (carId1 == id1) {
						assignCar = carId1;
					}
				}
				List memberList = member.getMemberList();
				int assignMember = 0;
				for (int i = 0; i < memberList.size(); i++) {
					Member m1 = (Member) memberList.get(i);
					if (memberId1 == m1.getMemberId()) {
						assignMember = memberId1;
					}
				}
				memberCarList.add(new MemberCar(carId1, (Member) memberList.get(assignMember),
						(Car) carList.get(assignCar), carReg, carColor));
				break;
			case 4:
				System.out.println("Enter Member Car Id : ");
				int memberCarId = sc.nextInt();
				for(int i=0;i<memberCarList.size();i++) {
					MemberCar memberCar=memberCarList.get(i);
					if(memberCar.getId()==memberCarId) {
						System.out.println(memberCar);
					}
				}

				break;
			case 5:
				System.exit(choice);
			default:
				System.out.println("Invalid Input");
			}
		} while (wizard);

	}

}
