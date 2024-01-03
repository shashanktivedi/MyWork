package com.java.codefit;

public class Address <T>{

	private String country;
	private String city;
	private String location;
	public Address(String country, String city, String location) {
		super();
		this.country = country;
		this.city = city;
		this.location = location;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Address [country=" + country + ", city=" + city + ", location=" + location + "]";
	}
	
	
}
