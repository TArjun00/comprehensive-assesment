package com.comprehensive.HospitalManagement;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="PatientsInformation")
public class Patient {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PatientID")
	private int pid;
	@Column(name="PatientName")
	private String pname;
	@Column(name="Age")
	private int page;
	@Column(name="Gender")
	private String pgender;
	@Column(name="VisitedDoctor")
	private String Visiteddoctor;
	@Column(name="Dateofvisit")
	private Date DateofVisit;
	@Column(name="Prescriptions")
	private String doctorsprescription;
	
	Patient(){
		
	}

	public Patient(int pid, String pname, int page, String pgender, String visiteddoctor, Date dateofVisit,
			String doctorsprescription) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.page = page;
		this.pgender = pgender;
		this.Visiteddoctor = visiteddoctor;
		this.DateofVisit = dateofVisit;
		this.doctorsprescription = doctorsprescription;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getPgender() {
		return pgender;
	}

	public void setPgender(String pgender) {
		this.pgender = pgender;
	}

	public String getVisiteddoctor() {
		return Visiteddoctor;
	}

	public void setVisiteddoctor(String visiteddoctor) {
		Visiteddoctor = visiteddoctor;
	}

	public Date getDateofVisit() {
		return DateofVisit;
	}

	public void setDateofVisit(Date dateofVisit) {
		DateofVisit = dateofVisit;
	}

	public String getDoctorsprescription() {
		return doctorsprescription;
	}

	public void setDoctorsprescription(String doctorsprescription) {
		this.doctorsprescription = doctorsprescription;
	}

	@Override
	public String toString() {
		return "Patient [pid=" + pid + ", pname=" + pname + ", page=" + page + ", pgender=" + pgender
				+ ", Visiteddoctor=" + Visiteddoctor + ", DateofVisit=" + DateofVisit + ", doctorsprescription="
				+ doctorsprescription + "]";
	}
	
	
	

}
