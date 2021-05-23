package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {
	
	
	@Id
	@GeneratedValue
	private Integer doctor_id;
	@Column
	private String doctor_name;
	@Column
	private Double doctor_experience;
	
}
