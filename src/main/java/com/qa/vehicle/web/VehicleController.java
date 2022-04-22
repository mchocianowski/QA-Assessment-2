package com.qa.vehicle.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.vehicle.domain.Vehicle;
import com.qa.vehicle.service.VehicleService;

@RestController
public class VehicleController {
	
	private VehicleService vservice;

	@Autowired
	public VehicleController(VehicleService vservice) {
		super();
		this.vservice = vservice;
	}

	@PostMapping("/create")
	public ResponseEntity<Vehicle> createVehicle(@RequestBody Vehicle v) {
		Vehicle created = this.vservice.create(v);
		ResponseEntity<Vehicle> response = new ResponseEntity<Vehicle>(created, HttpStatus.CREATED);
		return response;
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<Vehicle>> getAllVehicles() {
		return ResponseEntity.ok(this.vservice.getAll());
	}

	@GetMapping("/get/{id}")
	public Vehicle getVehicle(@PathVariable Integer id) {
		return this.vservice.getOne(id);
	}

	// read by brand
	@GetMapping("/getByBrand/{brand}")
	public ResponseEntity<List<Vehicle>> getVehiclesByBrand(@PathVariable String brand) {
		List<Vehicle> found = this.vservice.getVehiclesByBrand(brand);
		return ResponseEntity.ok(found);
	}

	// read by price
	@GetMapping("/getByPrice/{price}")
	public ResponseEntity<List<Vehicle>> getVehiclesByPrice(@PathVariable Integer price) {
		List<Vehicle> found = this.vservice.getVehiclesByPrice(price);
		return ResponseEntity.ok(found);
	}

	// read by mileage
	@GetMapping("/getByMileage/{mileage}")
	public ResponseEntity<List<Vehicle>> getVehiclesByMileage(@PathVariable Integer mileage) {
		List<Vehicle> found = this.vservice.getVehiclesByMileage(mileage);
		return ResponseEntity.ok(found);
	}


	@PutMapping("/replace/{id}")
	public ResponseEntity<Vehicle> replaceVehicle(@PathVariable Integer id, @RequestBody Vehicle newVehicle) {
		Vehicle body = this.vservice.replace(id, newVehicle);
		ResponseEntity<Vehicle> response = new ResponseEntity<Vehicle>(body, HttpStatus.ACCEPTED);
		return response;
	}

	@DeleteMapping("/remove/{id}")
	public ResponseEntity<?> removeVehicle(@PathVariable Integer id) {
		this.vservice.remove(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
