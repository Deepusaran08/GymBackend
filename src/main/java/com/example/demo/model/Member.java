package com.example.demo.model;

import jakarta.persistence.GeneratedValue;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "registrationDetails")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String gender;
    private String mobileNumber;
    private String email;
    private String medicalHistory;
    private Date registrationDate;
    private String subscriptionType;
    private Double amount;
    private String feeStatus;
    private String batch;
    
    
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Member(Long id, String firstName, String lastName, String gender, String mobileNumber, String email,
			String medicalHistory, Date registrationDate, String subscriptionType, Double amount, String feeStatus,
			String batch) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.medicalHistory = medicalHistory;
		this.registrationDate = registrationDate;
		this.subscriptionType = subscriptionType;
		this.amount = amount;
		this.feeStatus = feeStatus;
		this.batch = batch;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMedicalHistory() {
		return medicalHistory;
	}


	public void setMedicalHistory(String medicalHistory) {
		this.medicalHistory = medicalHistory;
	}


	public Date getRegistrationDate() {
		return registrationDate;
	}


	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}


	public String getSubscriptionType() {
		return subscriptionType;
	}


	public void setSubscriptionType(String subscriptionType) {
		this.subscriptionType = subscriptionType;
	}


	public Double getAmount() {
		return amount;
	}


	public void setAmount(Double amount) {
		this.amount = amount;
	}


	public String getFeeStatus() {
		return feeStatus;
	}


	public void setFeeStatus(String feeStatus) {
		this.feeStatus = feeStatus;
	}


	public String getBatch() {
		return batch;
	}


	public void setBatch(String batch) {
		this.batch = batch;
	}

    
}
