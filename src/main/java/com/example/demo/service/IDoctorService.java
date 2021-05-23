package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Doctor;

public interface IDoctorService {

	public Doctor addDoctor(Doctor doctor);
	public Doctor getDoctorById(Integer doctor_id);
	public List<Doctor> getAllDoctors();
}
