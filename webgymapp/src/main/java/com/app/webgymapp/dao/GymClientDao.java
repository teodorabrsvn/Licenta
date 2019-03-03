package com.app.webgymapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.webgymapp.model.GymClient;

@Repository
public interface GymClientDao extends JpaRepository<GymClient, Long> {

	
}
