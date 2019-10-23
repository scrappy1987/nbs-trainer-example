package com.qa.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.business.TrainerService;
import com.qa.persistence.domain.Trainer;

@RestController
@RequestMapping("/trainerapp")
public class TrainerController {

	@Autowired
	private TrainerService trainerService;
	
	@GetMapping("/trainer")
	public Trainer getAllTrainer() {
		return trainerService.getAllTrainer();
	}
	
	@PostMapping("/trainer")
	public Trainer addNewTrainer() {
		return trainerService.addNewTrainer();
	}
	
	@PutMapping("/trainer")
	public Trainer updateTrainer() {
		return trainerService.updateTrainer();
	}
	
	@DeleteMapping("/trainer")
	public Trainer deleteTrainer() {
		return trainerService.deleteTrainer();
	}

}
