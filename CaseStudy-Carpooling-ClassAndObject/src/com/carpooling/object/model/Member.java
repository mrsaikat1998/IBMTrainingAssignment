package com.carpooling.object.model;

import java.util.Date;

public class Member {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String contactNumber;
	private String licenceNumber;
	private Date licenceStartDate;
	private Date lisenceExpireDate;

	public Member() {

	}

	public Member(int id, String firstName, String lastName, String email, String contactNumber, String licenceNumber,
			Date licenceStartDate, Date lisenceExpireDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contactNumber = contactNumber;
		this.licenceNumber = licenceNumber;
		this.licenceStartDate = licenceStartDate;
		this.lisenceExpireDate = lisenceExpireDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getLicenceNumber() {
		return licenceNumber;
	}

	public void setLicenceNumber(String licenceNumber) {
		this.licenceNumber = licenceNumber;
	}

	public Date getLicenceStartDate() {
		return licenceStartDate;
	}

	public void setLicenceStartDate(Date licenceStartDate) {
		this.licenceStartDate = licenceStartDate;
	}

	public Date getLisenceExpireDate() {
		return lisenceExpireDate;
	}

	public void setLisenceExpireDate(Date lisenceExpireDate) {
		this.lisenceExpireDate = lisenceExpireDate;
	}

	@Override
	public String toString() {
		return "Member: " + firstName + ", " + lastName + "\nMember Contact Details : " + contactNumber + ", " + email;
	}

	public void compareMember(Member m1, Member m2) {
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		if (m1.contactNumber.equalsIgnoreCase(m2.contactNumber) && m1.email.equalsIgnoreCase(m2.email)) {
			System.out.println("Member 1 is same as Member 2");
		} else {
			System.out.println("Member 1 and Member 2 are diffrent");
		}

	}

}
