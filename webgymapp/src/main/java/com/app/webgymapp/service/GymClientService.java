package com.app.webgymapp.service;

import java.util.List;

import com.app.webgymapp.model.GymClient;

public interface GymClientService {
	
	GymClient saveGymClient(GymClient gymClient);
	
	GymClient updateGymClient(GymClient gymClient);
	
	List<GymClient> getAllGymClientsList();
	
	GymClient getGymClient(Long id);
	
	void deleteGymClient(Long id);

}
