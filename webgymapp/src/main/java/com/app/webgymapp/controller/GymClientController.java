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

import com.app.webgymapp.model.GymClass;
import com.app.webgymapp.model.GymClient;
import com.app.webgymapp.service.GymClassService;
import com.app.webgymapp.service.GymClientService;

@RequestMapping("gymclient")
@RestController
public class GymClientController {

	@Autowired
	private GymClientService gymClientService;
	
	@Autowired
	private GymClassService gymClassService;
	
	@PostMapping("/save")
	public GymClient save(@RequestBody GymClient gymClient) {
		return gymClientService.saveGymClient(gymClient);
	}
	
	@PutMapping("/update")
	public GymClient update(@RequestBody GymClient gymClient) {
		return gymClientService.updateGymClient(gymClient);
		
	}
	
	@GetMapping("/all")
	public List<GymClient> getAllGymClients() {
		return gymClientService.getAllGymClientList();
	}
	
	@GetMapping("/by/{gymClientId}")
	public GymClient getGymClient(@PathVariable(name = "gymClientId") Long gymClientId) {
		return gymClientService.getGymClient(gymClientId);
	}
	
	@DeleteMapping("/delete/{gymClientId}")
	public void deleteGymClient(@PathVariable(name = "gymClientId") Long gymClientId) {
		gymClientService.deleteGymClient(gymClientId);
	}
	
	@PutMapping("/addGymClass/{gymClientId}/{gymClassId}")
	public void addGymClass(@PathVariable(name = "gymClientId") Long gymClientId, @PathVariable(name = "gymClassId") Long gymClassId ){
		GymClient gymClient = gymClientService.getGymClient(gymClientId);
		GymClass gymClass= gymClassService.getGymClass(gymClassId);
		if(!gymClient.hasGymClass(gymClass) && !gymClass.hasGymClient(gymClient)) {
			gymClient.addGymClass(gymClass);
			gymClass.addGymClient(gymClient);
			gymClientService.updateGymClient(gymClient);
			gymClassService.updateGymClass(gymClass);
		}
	}
}
