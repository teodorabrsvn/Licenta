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
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "gymclass")
public class GymClass {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "classId")
	private Long classId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "coach")
	private String coach;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "difficulty")
	private String difficulty;
	
	
	//@JoinTable(name="reservationToClass", joinColumns={@JoinColumn(name="classId")},inverseJoinColumns= {@JoinColumn(name="gymClientId")})
	@ManyToMany
	@JsonIgnoreProperties("gymClasses")
	private List<GymClient> gymClients = new ArrayList<GymClient>();
	
	public void addGymClient(GymClient gymClient) {
		gymClients.add(gymClient);
	}
	
	public boolean hasGymClient(GymClient gymClient) {
		return gymClients.contains(gymClient);
	}

	public Long getClassId() {
		return classId;
	}

	public void setClassId(Long classId) {
		this.classId = classId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCoach() {
		return coach;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}

	public List<GymClient> getGymClients() {
		return gymClients;
	}

	public void setGymClients(List<GymClient> gymClients) {
		this.gymClients = gymClients;
	}
	
	 
}
