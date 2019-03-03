package com.app.webgymapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.webgymapp.dao.GymClientDao;
import com.app.webgymapp.model.GymClient;

@Service
public class GymClientServiceImpl implements GymClientService {

	@Autowired
	private GymClientDao gymClientDao;
	
	@Override
	public GymClient saveGymClient(GymClient gymClient) {
		// TODO Auto-generated method stub
		return gymClientDao.save(gymClient);
	}

	@Override
	public GymClient updateGymClient(GymClient gymClient) {
		// TODO Auto-generated method stub
		return gymClientDao.saveAndFlush(gymClient);
	}

	@Override
	public List<GymClient> getAllGymClientsList() {
		// TODO Auto-generated method stub
		return gymClientDao.findAll();
	}

	@Override
	public GymClient getGymClient(Long id) {
		// TODO Auto-generated method stub
		return gymClientDao.findOne(id);
	}

	@Override
	public void deleteGymClient(Long id) {
		// TODO Auto-generated method stub
		gymClientDao.delete(id);
	}

}
