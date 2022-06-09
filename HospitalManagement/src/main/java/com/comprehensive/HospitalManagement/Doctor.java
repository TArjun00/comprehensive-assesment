package com.comprehensive.HospitalManagement;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="doctorsinformation")
public class Doctor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="DoctorID")
	private int Doctorid;
	@Column(name="nameofdoctors")
	private String DoctorName;
	@Column(name="age")
	private int DoctorAge;
	@Column(name="gender")
	private String Doctorgender;
	@Column(name="specialistfield")
	private String specialistfields;
	@Column(name="patientsattended")
	private int NoofPatientAttended;
	
	Doctor(){
		
	}
	public Doctor(int doctorid, String doctorName, int doctorAge, String doctorgender, String specialistfields,
			int noofPatientAttended) {
		super();
		this.Doctorid = doctorid;
		this.DoctorName = doctorName;
		this.DoctorAge = doctorAge;
		this.Doctorgender = doctorgender;
		this.specialistfields = specialistfields;
		this.NoofPatientAttended = noofPatientAttended;
	}
	public int getDoctor_id() {
		return Doctorid;
	}
	public void setDoctor_id(int doctor_id) {
		Doctorid = doctor_id;
	}
	public String getDoctor_Name() {
		return DoctorName;
	}
	public void setDoctor_Name(String doctor_Name) {
		DoctorName = doctor_Name;
	}
	public int getDoctor_Age() {
		return DoctorAge;
	}
	public void setDoctor_Age(int doctor_Age) {
		DoctorAge = doctor_Age;
	}
	public String getDoctor_gender() {
		return Doctorgender;
	}
	public void setDoctor_gender(String doctor_gender) {
		Doctorgender = doctor_gender;
	}
	public String getSpecialistfields() {
		return specialistfields;
	}
	public void setSpecialistfields(String specialistfields) {
		this.specialistfields = specialistfields;
	}
	public int getNoofPatientAttended() {
		return NoofPatientAttended;
	}
	public void setNoofPatientAttended(int noofPatientAttended) {
		NoofPatientAttended = noofPatientAttended;
	}
	@Override
	public String toString() {
		return "Doctor [Doctorid=" + Doctorid + ", DoctorName=" + DoctorName + ", DoctorAge=" + DoctorAge
				+ ", Doctorgender=" + Doctorgender + ", specialistfields=" + specialistfields
				+ ", NoofPatientAttended=" + NoofPatientAttended + "]";
	}
	
	

	
	
	
	
}
