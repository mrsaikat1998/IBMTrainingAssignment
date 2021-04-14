package com.nt.test;

import com.nt.model.Product;

public class ProductTest {

	public static void main(String[] args) {
Product product=new Product();
		
		product.setProductCode("P101");
		product.setProductName("Laptop");
		product.setProductPrice(45000.0);
		
		System.out.println("Product Code :"+product.getProductCode());
		System.out.println("Product Code :"+product.getProductName());
		System.out.println("Product Code :"+product.getProductPrice());
		


	}

}
