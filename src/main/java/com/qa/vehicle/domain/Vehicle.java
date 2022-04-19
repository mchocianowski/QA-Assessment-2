package com.qa.vehicle.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicle{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false)
	private String brand;
	
	@Column(nullable = false)
	private String model;
	
	@Column(nullable = false)
	private Integer price;
	
	@Column(nullable = false)
	private Integer mileage;

	public Vehicle(Integer id, String brand, String model, Integer price, Integer mileage) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.mileage = mileage;
	}

	public Vehicle() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getMileage() {
		return mileage;
	}

	public void setMileage(Integer mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "vehicle [id=" + id + ", brand=" + brand + ", model=" + model + ", price=" + price + ", mileage="
				+ mileage + "]";
	}
	
	
}
