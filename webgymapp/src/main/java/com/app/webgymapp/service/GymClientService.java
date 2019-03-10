package com.app.webgymapp.service;

import java.util.List;

import com.app.webgymapp.model.GymClient;

public interface GymClientService {
	
	GymClient saveGymClient(GymClient gymClient);
	
	GymClient updateGymClient(GymClient gymClient);
	
	List<GymClient> getAllGymClientList();
	
	GymClient getGymClient(Long gymClientId);
	
	void deleteGymClient(Long gymClientId);

}
