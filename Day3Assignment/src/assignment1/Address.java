package assignment1;

public class Address {
	private String city;
	private String addressLine;

	public Address(String addrressLine, String city) {
		this.addressLine = addrressLine;
		this.city = city;
	}

	public String getAddrressLine() {
		return addressLine;
	}

	public void setAddrressLine(String addrressLine) {
		this.addressLine = addrressLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddressDetails() {
		return addressLine + ", " + city;
	}

	@Override
	public String toString() {
		return getAddressDetails();
	}

}
