package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Doctor;
import com.example.demo.service.IDoctorService;

@RestController
@RequestMapping(value = "/doctors")
public class DoctorController {

	@Autowired
	private IDoctorService dservice;

	/*
	 * http://localhost:8080/doctors/saveDoctor
	  	{
	  		"doctor_name":"Rajeev",
	  		"doctor_city":"Bangalore"
	  	}
	 */
	@PostMapping(value = "/saveDoctor")
	public ResponseEntity<Doctor> addDoctor(@RequestBody Doctor doctor) {
		return new ResponseEntity<Doctor>(dservice.addDoctor(doctor), HttpStatus.CREATED);
	}

	/*
	 * http://localhost:8080/doctors/allDoctors
	 */
	@GetMapping(value = "/allDoctors")
	public ResponseEntity<List<Doctor>> getAllDoctor() {
		return new ResponseEntity<List<Doctor>>(dservice.getAllDoctors(), HttpStatus.OK);
	}

	/*
	 * http://localhost:8080/doctors/1
	 */
	@GetMapping(value = "/{doctor_id}")
	public ResponseEntity<Doctor> getOneDoctor(@PathVariable Integer doctor_id) {
		return new ResponseEntity<Doctor>(dservice.getDoctorById(doctor_id), HttpStatus.OK);
	}

}
