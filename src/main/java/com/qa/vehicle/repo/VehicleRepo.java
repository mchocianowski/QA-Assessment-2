package com.qa.vehicle.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.vehicle.domain.Vehicle;

public interface VehicleRepo extends JpaRepository<Vehicle, Integer> {

	
	//SPRING WILL AUTO-GENERATE ALL OF THE BASIC CRUD FUNCTIONALITY :)
	
	List<Vehicle> findByBrandIgnoreCase(String brand);
	List<Vehicle> findByModelIgnoreCase(String model);
	List<Vehicle> findByPriceIgnoreCase(Integer price);
	List<Vehicle> findByPrice(Integer mileage);
	List<Vehicle> findByMileage(Integer mileage);
}
