package com.qa.vehicle.web;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.vehicle.domain.Vehicle;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc //sets up the MockMvc object
@Sql(scripts = {"classpath:vehicle-schema.sql", "classpath:vehicle-data.sql"}, executionPhase=ExecutionPhase.BEFORE_TEST_METHOD)
@ActiveProfiles("test")
public class VehicleControllerIntegratedTest {

	@Autowired
	private MockMvc mvc;
	
	@Autowired
	private ObjectMapper mapper;
	
	@Test
	void testCreate() throws Exception {
	Vehicle testVehicle = new Vehicle(null,"Tesla", "model 3", 30000, 50000);
	String testVehicleAsJSON = this.mapper.writeValueAsString(testVehicle);
	RequestBuilder req = post("/create").contentType(MediaType.APPLICATION_JSON).content(testVehicleAsJSON);
	
	Vehicle testCreatedVehicle = new Vehicle(3,"Tesla", "model 3", 30000, 50000);
	String testCreatedVehicleAsJSON = this.mapper.writeValueAsString(testCreatedVehicle);
	
	ResultMatcher checkStatus = status().isCreated();
	ResultMatcher checkBody = content().json(testCreatedVehicleAsJSON);
	
	this.mvc.perform(req).andExpect(checkStatus).andExpect(checkBody);
	}
	
	@Test
	void getAllTest() throws Exception {
		RequestBuilder req = get("/getAll");
		
		List<Vehicle> testVehicles = List.of(new Vehicle(1,"Tesla", "model 3", 30000, 50000), new Vehicle(2,"Volvo","s60",25000,60000));
		String json = this.mapper.writeValueAsString(testVehicles);
		
		ResultMatcher checkStatus = status().isOk();
		ResultMatcher checkBody = content().json(json);
		
		this.mvc.perform(req).andExpect(checkStatus).andExpect(checkBody);
	}
}
