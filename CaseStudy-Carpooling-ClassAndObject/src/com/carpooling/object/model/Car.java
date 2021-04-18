package com.carpooling.object.model;

public abstract class Car {
	private long id;
	private String name;
	private String model;
	private int makeYear;
	private String company;
	private int cofortLevel;

	public Car() {
	}

	public Car(long id, String name, String model, int makeYear, String company, int cofortLevel) {
		this.id = id;
		this.name = name;
		this.model = model;
		this.makeYear = makeYear;
		this.company = company;
		this.cofortLevel = cofortLevel;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
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

	public int getCofortLevel() {
		return cofortLevel;
	}

	public void setCofortLevel(int cofortLevel) {
		this.cofortLevel = cofortLevel;
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

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + "]";
	}

}
