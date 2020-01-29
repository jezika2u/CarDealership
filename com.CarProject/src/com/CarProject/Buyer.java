package com.CarProject;

public class Buyer {
	
	String firstName;
	String lastName;
	String email;
	String street;
	String city;
	String state;
	String zip;

	
	public Buyer() {}
	
	public Buyer(String firstName,String lastName, String email, 
			String street, String city, String state, String zip)
	{
		
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

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Buyer [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", street=" + street
				+ ", city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}
	
	
	
}
