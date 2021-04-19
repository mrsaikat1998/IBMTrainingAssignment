package com.assignment.two;

public class Customer {
	private String custNo;
	private String custName;
	private String category;

	public Customer(String custNo, String custName, String category) throws InvalidInputException {
		if (custNo.startsWith("C") || custNo.startsWith("c"))
			this.custNo = custNo;
		else
			throw new InvalidInputException("custId must starts with c");
		if (custName.length() == 4)
			this.custName = custName;
		else
			throw new InvalidInputException("Name must contain 4 char");
		if (category.equalsIgnoreCase("Platinum") || category.equalsIgnoreCase("Gold")
				|| category.equalsIgnoreCase("Silver"))
			this.category = category;
		else
			throw new InvalidInputException("Your Category not in list");
	}

	public String getCustNo() {
		return custNo;
	}

	public String getCustName() {
		return custName;
	}

	public String getCategory() {
		return category;
	}

}
