package com.alarq.studentmanagement.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_details")
public class StudentDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="birth_date")
	private Date birthDate;
	
	@Column(name="birth_place")
	private String birthPlace;
	
	@Column(name="address")
	private String address;

	
	public StudentDetails() {}
	
	public StudentDetails(int id, Date birthDate, String birthPlace, String address) {
		super();
		this.id = id;
		this.birthDate = birthDate;
		this.birthPlace = birthPlace;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "StudentDetails [id=" + id + ", birthDate=" + birthDate + ", birthPlace=" + birthPlace + ", address="
				+ address + "]";
	}
	
	
	
}
