package com.comprehensive.HospitalManagement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hospitalmanagement")
@CrossOrigin
public class PatientController {
	@Autowired
	PatientRepository patrepo;
	
	@GetMapping("/allPatients")
	public List<Patient> getpatients() {
		return patrepo.findAll();
	}
	@GetMapping("/getpatient/{id}")
	public  Optional<Patient> findpatient(@PathVariable int id) {
		return patrepo.findById(id);
	}
	@CrossOrigin
	@PostMapping("/allPatients")
	public Patient  addpatient(@RequestBody Patient patient) {
		return patrepo.save(patient);
	}

}
