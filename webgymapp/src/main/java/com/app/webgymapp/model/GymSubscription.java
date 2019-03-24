package com.app.webgymapp.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "gymsubscription")
public class GymSubscription {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idSubscription")
	private Long idSubscription;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "price")
	private Integer price;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "period")
	private Integer period;
	
	@OneToMany
	@JoinColumn(name = "gymClientId")
	private List<GymClient>gymClients=new ArrayList<GymClient>();

	public Long getIdSubscription() {
		return idSubscription;
	}

	public List<GymClient> getGymClients() {
		return gymClients;
	}

	public void setGymClients(List<GymClient> gymClients) {
		this.gymClients = gymClients;
	}

	public void setIdSubscription(Long idSubscription) {
		this.idSubscription = idSubscription;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPeriod() {
		return period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
	}
	
	
	

}
