package com.app.webgymapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.webgymapp.dao.GymClassDao;
import com.app.webgymapp.model.GymClass;

@Service
public class GymClassServiceImpl implements GymClassService {
	
	@Autowired
	private GymClassDao gymClassDao;

	@Override
	public GymClass saveGymClass(GymClass gymClass) {
		// TODO Auto-generated method stub
		return gymClassDao.save(gymClass);
	}

	@Override
	public GymClass updateGymClass(GymClass gymClass) {
		// TODO Auto-generated method stub
		return gymClassDao.saveAndFlush(gymClass);
	}

	@Override
	public List<GymClass> getAllGymClassList() {
		// TODO Auto-generated method stub
		return gymClassDao.findAll();
	}

	@Override
	public GymClass getGymClass(Long gymClassId) {
		// TODO Auto-generated method stub
		return gymClassDao.findOne(gymClassId);
	}

	@Override
	public void deleteGymClass(Long gymClassId) {
		// TODO Auto-generated method stub
		gymClassDao.delete(gymClassId);
	}

}
