package com.nt.model;

public class Product2 {
	private static  int productCounter = 100;
	private String productCode;
	private String productName;
	private double productPrice;
	private char categoryCode;

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public char getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(char categoryCode) {
		this.categoryCode = categoryCode;
	}

	public static int getProductCounter() {
		return productCounter;
	}
private  String generateProductCode() {
	productCounter++;
	String s=""+productCounter;	
	return s;
}

public Product2(String productName, double productPrice, char categoryCode) {
	this.productName = productName;
	this.productPrice = productPrice;
	this.categoryCode = categoryCode;
	this.productCode=generateProductCode();
}

public Product2(String productName, double productPrice) {
	this.productName = productName;
	this.productPrice = productPrice;
	this.productCode=generateProductCode();
	this.categoryCode='E';
}

public void getProductDetails() {
	System.out.println("Product : Code - "+productCode+", Name - "+productName+", price - "+productPrice+", category - "+categoryCode);
}

}
