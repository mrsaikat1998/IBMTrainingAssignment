package com.carpooling.arraylist;

public class MemberCar {
	private long Id;
	private Member member;
	private Car car;
	private String carRegistration;
	private String color;

	public MemberCar(long id, Member member, Car car, String carRegistration, String color) {
		super();
		Id = id;
		this.member = member;
		this.car = car;
		this.carRegistration = carRegistration;
		this.color = color;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public String getCarRegistration() {
		return carRegistration;
	}

	public void setCarRegistration(String carRegistration) {
		this.carRegistration = carRegistration;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "MemberCar [Id=" + Id + ", member=" + member + ", car=" + car + ", carRegistration=" + carRegistration
				+ ", color=" + color + "]";
	}

}
