package com.qa.vehicle.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.qa.vehicle.domain.Vehicle;
import com.qa.vehicle.repo.VehicleRepo;

@Service
public class VehicleService {

	private VehicleRepo vrepo;
	
	@Autowired
	public VehicleService(VehicleRepo vrepo) {
		super();
		this.vrepo=vrepo;
	}
	
	//CRUD	
		public Vehicle create(Vehicle v) {
			Vehicle created = this.vrepo.save(v);
			return created;
		}

		public List<Vehicle> getAll() {
			return this.vrepo.findAll();
		}

		public Vehicle getOne(Integer id) {
			Optional<Vehicle> found = this.vrepo.findById(id);
			return found.get();
		}
		
		public List<Vehicle> getVehiclesByBrand(String brand) {
			List<Vehicle> found = this.vrepo.findByBrandIgnoreCase(brand);
			return found;
		}
			
		public List<Vehicle> getVehiclesByPrice(Integer price) {
			List<Vehicle> found = this.vrepo.findByPrice(price);
			return found;
		}
			
		public List<Vehicle> getVehiclesByMileage(Integer mileage) {
			List<Vehicle> found = this.vrepo.findByMileage(mileage);
			return found;
		}

		public Vehicle replace(Integer id, Vehicle newVehicle) {
			Vehicle existing = this.vrepo.findById(id).get();
			existing.setBrand(newVehicle.getBrand());
			existing.setModel(newVehicle.getModel());
			existing.setPrice(newVehicle.getPrice());
			existing.setMileage(newVehicle.getMileage());
			Vehicle updated = this.vrepo.save(existing);
			return updated;
		}

		public void remove(@PathVariable Integer id) {
			this.vrepo.deleteById(id);

		}
}
