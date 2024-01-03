package com.learn.comparableSort;

public class Laptop implements Comparable<Laptop>  {

	private String brand;
	private int ram;
	private int price;
	
	
	
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Laptop(String brand, int ram, int price) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", ram=" + ram + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Laptop laps2) {
		//this(1st obj)>laps2 = +
		//this(1st obj)<laps2 = -
		//this(1st obj)>laps2 = 0
		
		if(this.getRam()>laps2.getRam()) 
			return 1;
		else 
				return -1;	
	
	}	
	
	/*
	 * @Override public int compareTo(Laptop laps2) { //this(1st obj)>laps2 = +
	 * //this(1st obj)<laps2 = - //this(1st obj)>laps2 = 0
	 * 
	 * if(this.getBrand().length()>laps2.getBrand().length()) return 1; else return
	 * -1;
	 * 
	 * }
	 */
	
}
