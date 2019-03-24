package com.app.webgymapp.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "gymclient")

public class GymClient {
	
	@Id
	@Column(name = "gymClientId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long gymClientId;
	
	@Column(name = "firstName")
	private String firstName;
	
	@Column(name = "secondName")
	private String secondName;
	
	@Column(name = "occupation")
	private String occupation;
	
	@Column(name = "adress")
	private String adress;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "phoneNumber")
	private String phoneNumber;
	
	@Column(name = "email")
	private String email;
	
	@ManyToMany(mappedBy="gymClients")
	@JsonIgnoreProperties("gymClients")
	private List<GymClass> gymClasses = new ArrayList<GymClass>();
	
	@ManyToOne
	@JsonIgnoreProperties("gymClients")
	private GymSubscription gymSubscription;
	
	public GymSubscription getGymSubscription() {
		return gymSubscription;
	}

	public void setGymSubscription(GymSubscription gymSubscription) {
		this.gymSubscription = gymSubscription;
	}

	public void addGymClass(GymClass gymClass) {
		gymClasses.add(gymClass);
	}
	
	public boolean hasGymClass(GymClass gymClass) {
		return gymClasses.contains(gymClass);
	}
	
	public List<GymClass> getGymClasses() {
		return gymClasses;
	}

	public void setGymClasses(List<GymClass> gymClasses) {
		this.gymClasses = gymClasses;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getGymClientId() {
		return gymClientId;
	}

	public void setGymClientId(Long gymClientId) {
		this.gymClientId = gymClientId;
	}
	

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
}
