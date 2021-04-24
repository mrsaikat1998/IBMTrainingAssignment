package com.carpooling.arraylist.hashmap;

public class Member {
	private String firstName;
	private String lastName;
	private String email;
	private String mobNo;
	private String registrationId;
	private String registrationStartDate;
	private String registrationEndDate;

	public Member() {
	}

	public Member(String firstName, String lastName, String email, String mobNo, String registrationId,
			String registrationStartDate, String registrationEndDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobNo = mobNo;
		this.registrationId = registrationId;
		this.registrationStartDate = registrationStartDate;
		this.registrationEndDate = registrationEndDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public String getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}

	public String getRegistrationStartDate() {
		return registrationStartDate;
	}

	public void setRegistrationStartDate(String registrationStartDate) {
		this.registrationStartDate = registrationStartDate;
	}

	public String getRegistrationEndDate() {
		return registrationEndDate;
	}

	public void setRegistrationEndDate(String registrationEndDate) {
		this.registrationEndDate = registrationEndDate;
	}

	@Override
	public String toString() {
		return "Member [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", mobNo=" + mobNo
				+ ", registrationId=" + registrationId + ", registrationStartDate=" + registrationStartDate
				+ ", registrationEndDate=" + registrationEndDate + "]";
	}

}
