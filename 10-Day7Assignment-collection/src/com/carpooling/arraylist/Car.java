package com.carpooling.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Car {
	private long id;
	private String name;
	private String Model;
	private int makeYear;
	private String company;
	private int comfortLevel;
	private static List<Car> carList = new ArrayList<>();

	public Car() {
		
	}

	public Car(long id, String name, String model, int makeYear, String company, int comfortLevel) {
		this.id = id;
		this.name = name;
		Model = model;
		this.makeYear = makeYear;
		this.company = company;
		this.comfortLevel = comfortLevel;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public int getMakeYear() {
		return makeYear;
	}

	public void setMakeYear(int makeYear) {
		this.makeYear = makeYear;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getComfortLevel() {
		return comfortLevel;
	}

	public void setComfortLevel(int comfortLevel) {
		this.comfortLevel = comfortLevel;
	}

	public List<Car> getCarList() {
		return carList;
	}

	public void setCarList(Car car) {
		this.carList.add(car);
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", Model=" + Model + ", makeYear=" + makeYear + ", company="
				+ company + ", comfortLevel=" + comfortLevel + "]";
	}

}
