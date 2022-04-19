package com.qa.vehicle.domain;


public class vehicle{
	
	private Integer id;

	private String brand;
	
	private String model;
	
	private Integer price;
	
	private Integer mileage;

	public vehicle(Integer id, String brand, String model, Integer price, Integer mileage) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.mileage = mileage;
	}

	public vehicle() {
		super();
	}
	
	
}
