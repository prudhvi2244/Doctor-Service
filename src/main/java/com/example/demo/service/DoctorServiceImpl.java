package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Doctor;
import com.example.demo.repository.DoctorRepository;

@Service
public class DoctorServiceImpl implements IDoctorService {

	@Autowired
	private DoctorRepository drepo;

	@Override
	public Doctor addDoctor(Doctor doctor) {
		return drepo.save(doctor);
	}

	@Override
	public Doctor getDoctorById(Integer doctor_id) {
		return drepo.findById(doctor_id).get();
	}

	@Override
	public List<Doctor> getAllDoctors() {

		return drepo.findAll();
	}

}
