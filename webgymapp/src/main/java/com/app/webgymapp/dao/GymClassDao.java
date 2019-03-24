package com.app.webgymapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.webgymapp.model.GymClass;

@Repository
public interface GymClassDao extends JpaRepository<GymClass, Long> {

}
