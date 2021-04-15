package assignment2;

public class Product1 {
	private String productCode;
	private String productName;
	private double productPrice;

	public Product1(String productCode, String productName, double productPrice) {
		this.productCode = productCode;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	public void displayProductDetails() {
		System.out.println("ProductCode : "+productCode+"\nProductName : "+productName+"\nProductPrice : "+productPrice);
	}
}
