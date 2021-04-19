package com.carpooling.object.model;

public class MemberCar {
	private long id;
	private Car car;
	private long carRegistration;
	private String carColor;

	public MemberCar(long id, Car car, long carRegistration, String carColor) {
		super();
		this.id = id;
		this.car = car;
		this.carRegistration = carRegistration;
		this.carColor = carColor;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public long getCarRegistration() {
		return carRegistration;
	}

	public void setCarRegistration(long carRegistration) {
		this.carRegistration = carRegistration;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	@Override
	public String toString() {
		return "MemberCar [id=" + id + ", car=" + car + ", carRegistration=" + carRegistration + ", carColor="
				+ carColor + "]";
	}

}
