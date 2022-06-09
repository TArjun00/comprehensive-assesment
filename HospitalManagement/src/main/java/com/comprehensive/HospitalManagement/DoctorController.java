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

@CrossOrigin
@RestController
@RequestMapping("/hospitalmanagement")
public class DoctorController {
	@Autowired
	DoctorRepository docrepo;
	
	@GetMapping("/alldoctors")
	public List<Doctor> getalldoctors()
	{
		return docrepo.findAll();
	}
	
	@GetMapping("/getAdoctor/{id}")
	public Optional<Doctor> getadoctor(@PathVariable int id) {
		return docrepo.findById(id);
	}
	
	@CrossOrigin
	@PostMapping("/alldoctors")
	public Doctor adddoctor(@RequestBody Doctor doctor) {
		return docrepo.save(doctor);
	}
}
	
	


