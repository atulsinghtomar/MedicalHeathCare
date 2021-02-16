package com.healthcare.model;

public class UserModel {

	private int id;
	private String category;
	private String firstname;
	private String lastname;
	private String mobileNumber;
	private String address;
	private String gender;
	private int weight;
	private int height;

	public UserModel() {
		super();
	}

	public UserModel(int id, String category, String firstname, String lastname, String mobileNumber, String address,
			String gender, int weight, int height) {
		super();
		this.id = id;
		this.category = category;
		this.firstname = firstname;
		this.lastname = lastname;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.gender = gender;
		this.weight = weight;
		this.height = height;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "UserModel [id=" + id + ", category=" + category + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", mobileNumber=" + mobileNumber + ", address=" + address + ", gender=" + gender + ", weight="
				+ weight + ", height=" + height + "]";
	}

}
