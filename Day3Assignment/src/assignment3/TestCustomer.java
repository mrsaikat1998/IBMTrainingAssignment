package assignment3;

public class TestCustomer {

	public static void main(String[] args) {
		
		Customer cust2 = new Customer("John", new Address("1st Main HSR Layout", "Bengaluru"),new Address("1st Main Electronic City", "Bengaluru"));
		System.out.println(cust2.getCustomerDetails());
	}

}
