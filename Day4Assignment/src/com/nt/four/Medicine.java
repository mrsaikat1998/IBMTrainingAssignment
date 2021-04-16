package com.nt.four;

public abstract class Medicine {
	private double price;
	private String expiryDate;
	
	public abstract String displayLabel();

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	public void getDetails() {
		System.out.println("Price : "+price+"\nExpiry Date : "+expiryDate);
	}

}
