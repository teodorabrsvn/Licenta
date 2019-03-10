package com.app.webgymapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "gymclient")

public class GymClient {
	
	@Id
	@Column(name = "gym_client_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long gymClientId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "adress")
	private String adress;
	
	@Column(name = "occupation")
	private String occupation;

	public Long getGymClientId() {
		return gymClientId;
	}

	public void setGymClientId(Long gymClientId) {
		this.gymClientId = gymClientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
