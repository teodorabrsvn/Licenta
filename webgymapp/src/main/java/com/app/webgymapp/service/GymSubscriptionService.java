package com.app.webgymapp.service;

import java.util.List;
import com.app.webgymapp.model.GymSubscription;

public interface GymSubscriptionService {

	GymSubscription saveGymSubscription(GymSubscription gymSubscription);
	
	GymSubscription updateGymSubscription(GymSubscription gymSubscription);
	
	List<GymSubscription> getAllGymSubscriptionList();
	
	GymSubscription getGymSubscription(Long gymSubscriptionId);
	
	void deleteGymSubscription(Long gymSubscriptionId);
}
