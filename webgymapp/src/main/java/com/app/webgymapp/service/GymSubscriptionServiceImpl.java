package com.app.webgymapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.webgymapp.dao.GymSubscriptionDao;
import com.app.webgymapp.model.GymSubscription;

@Service
public class GymSubscriptionServiceImpl implements GymSubscriptionService{

	@Autowired
	private GymSubscriptionDao gymSubscriptionDao;
	
	@Override
	public GymSubscription saveGymSubscription(GymSubscription gymSubscription) {
		// TODO Auto-generated method stub
		return gymSubscriptionDao.save(gymSubscription);
	}

	@Override
	public GymSubscription updateGymSubscription(GymSubscription gymSubscription) {
		// TODO Auto-generated method stub
		return gymSubscriptionDao.saveAndFlush(gymSubscription);
	}

	@Override
	public List<GymSubscription> getAllGymSubscriptionList() {
		// TODO Auto-generated method stub
		return gymSubscriptionDao.findAll();
	}

	@Override
	public GymSubscription getGymSubscription(Long gymSubscriptionId) {
		// TODO Auto-generated method stub
		return gymSubscriptionDao.findOne(gymSubscriptionId);
	}

	@Override
	public void deleteGymSubscription(Long gymSubscriptionId) {
		// TODO Auto-generated method stub
		gymSubscriptionDao.delete(gymSubscriptionId);
	}

}
