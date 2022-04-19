package com.qa.vehicle.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.vehicle.domain.Vehicle;

public interface VehicleRepo extends JpaRepository<Vehicle, Integer> {

	
	//SPRING WILL AUTO-GENERATE ALL OF THE BASIC CRUD FUNCTIONALITY :)
	
	List<Vehicle> findByNameIgnoreCase(String brand);
	List<Vehicle> findByBreedIgnoreCase(String model);
	List<Vehicle> findByGenderIgnoreCase(Integer price);
	List<Vehicle> findByAge(Integer mileage);
}
