package assignment1;

public class TestCustomer {

	public static void main(String[] args) {
		
		Customer cust1 = new Customer();
		//set the value
		cust1.setCustomerName("John");
		cust1.setResidentialAddress(new Address("1st Main HSR Layout", "Bengaluru"));
		//get the value
		System.out.println(cust1.getCustomerName());
		System.out.println(cust1.getResidentialAddress());
		
		System.out.println("--------------------------------------------------");
		
		Customer cust2 = new Customer("John", new Address("1st Main HSR Layout", "Bengaluru"));
		System.out.println(cust2.getCustomerDetails());
	}

}
