package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Doctor;
import com.example.demo.service.DoctorService;

@RestController
public class DoctorController {
	@PostMapping("hospital/addDoctor")
	String addDoctor(@RequestBody Doctor doctor) {

		DoctorService ds = new DoctorService();
		ds.saveDoctorInDb(doctor);

		return "Hello, Dr. Gaurav, your info is added in our database";
	}

}
