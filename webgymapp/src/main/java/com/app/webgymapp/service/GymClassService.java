package com.app.webgymapp.service;

import java.util.List;

import com.app.webgymapp.model.GymClass;

public interface GymClassService {
	
	GymClass saveGymClass(GymClass gymClass);
	
	GymClass updateGymClass(GymClass gymClass);
	
	List<GymClass> getAllGymClassList();
	
	GymClass getGymClass(Long gymClassId);
	
	void deleteGymClass(Long gymClassId);

}
