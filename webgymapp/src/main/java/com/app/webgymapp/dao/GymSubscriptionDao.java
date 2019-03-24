package com.app.webgymapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.webgymapp.model.GymSubscription;

public interface GymSubscriptionDao extends JpaRepository<GymSubscription, Long>{

}
