package assignment1;

public class ProductTest {

	public static void main(String[] args) {
		//create new object
		Product product = new Product();
		//set values
		product.setProductCode("P101");
		product.setProductName("Laptop");
		product.setProductPrice(45000.0);
		//get values
		System.out.println("Product Code : " + product.getProductCode());
		System.out.println("Product Code : " + product.getProductName());
		System.out.println("Product Code : " + product.getProductPrice());

	}

}
