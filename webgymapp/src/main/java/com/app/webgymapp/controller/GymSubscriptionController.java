package com.app.webgymapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.webgymapp.model.GymSubscription;
import com.app.webgymapp.model.GymSubscription;
import com.app.webgymapp.service.GymClassService;
import com.app.webgymapp.service.GymSubscriptionService;

@RequestMapping("gymsubscription")
@RestController
public class GymSubscriptionController {
	
	@Autowired
	private GymSubscriptionService gymSubscriptionService;
	
	@PostMapping("/save")
	public GymSubscription save(@RequestBody GymSubscription gymSubscription) {
		return gymSubscriptionService.saveGymSubscription(gymSubscription);
	}
	
	@PutMapping("/update")
	public GymSubscription update(@RequestBody GymSubscription gymSubscription) {
		return gymSubscriptionService.updateGymSubscription(gymSubscription);
		
	}
	
	@GetMapping("/all")
	public List<GymSubscription> getAllGymSubscriptions() {
		return gymSubscriptionService.getAllGymSubscriptionList();
	}
	
	@GetMapping("/by/{gymSubscriptionId}")
	public GymSubscription getGymSubscription(@PathVariable(name = "gymSubscriptionId") Long gymSubscriptionId) {
		return gymSubscriptionService.getGymSubscription(gymSubscriptionId);
	}
	
	@DeleteMapping("/delete/{gymSubscriptionId}")
	public void deleteGymSubscription(@PathVariable(name = "gymSubscriptionId") Long gymSubscriptionId) {
		gymSubscriptionService.deleteGymSubscription(gymSubscriptionId);
	}


}
