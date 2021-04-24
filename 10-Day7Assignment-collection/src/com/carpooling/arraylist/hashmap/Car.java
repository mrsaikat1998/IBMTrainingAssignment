package com.carpooling.arraylist.hashmap;

public class Car {
	private String carName;
	private String carCategory;
	private int makeYear;
	private String companyName;
	private int comfortLevel;

	public Car() {
	}

	public Car(String carName, String carCategory, int makeYear, String companyName, int comfortLevel) {
		this.carName = carName;
		this.carCategory = carCategory;
		this.makeYear = makeYear;
		this.companyName = companyName;
		this.comfortLevel = comfortLevel;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarCategory() {
		return carCategory;
	}

	public void setCarCategory(String carCategory) {
		this.carCategory = carCategory;
	}

	public int getMakeYear() {
		return makeYear;
	}

	public void setMakeYear(int makeYear) {
		this.makeYear = makeYear;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getComfortLevel() {
		return comfortLevel;
	}

	public void setComfortLevel(int comfortLevel) {
		this.comfortLevel = comfortLevel;
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carCategory=" + carCategory + ", makeYear=" + makeYear + ", companyName="
				+ companyName + ", comfortLevel=" + comfortLevel + "]";
	}

}
