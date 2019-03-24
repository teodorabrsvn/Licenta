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
import com.app.webgymapp.service.GymClassService;


@RequestMapping("gymclass")
@RestController
public class GymClassController {
	
	@Autowired
	private GymClassService gymClassService;
	
	@PostMapping("/save")
	public GymClass save(@RequestBody GymClass gymClass) {
		return gymClassService.saveGymClass(gymClass);
	}
	
	@PutMapping("/update")
	public GymClass update(@RequestBody GymClass gymClass) {
		return gymClassService.updateGymClass(gymClass);
		
	}
	
	@GetMapping("/all")
	public List<GymClass> getAllGymClasss() {
		return gymClassService.getAllGymClassList();
	}
	
	@GetMapping("/by/{GymClassId}")
	public GymClass getGymClass(@PathVariable(name = "gymClassId") Long gymClassId) {
		return gymClassService.getGymClass(gymClassId);
	}
	
	@DeleteMapping("/delete/{GymClassId}")
	public void deleteGymClass(@PathVariable(name = "gymClassId") Long gymClassId) {
		gymClassService.deleteGymClass(gymClassId);
	}


}
