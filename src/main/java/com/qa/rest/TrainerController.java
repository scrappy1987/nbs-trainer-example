package com.qa.rest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.persistence.domain.Trainer;

@RestController
@RequestMapping("/trainerapp")
public class TrainerController {

	@GetMapping("/trainer")
	public Trainer getAllTrainer() {
		return new Trainer("John", "Gordon");
	}
	
	@PostMapping("/trainer")
	public Trainer addNewTrainer() {
		return new Trainer("John", "Gordon");
	}
	
	@PutMapping("/trainer")
	public Trainer updateTrainer() {
		return new Trainer("John", "Gordon");
	}
	
	@DeleteMapping("/trainer")
	public Trainer deleteTrainer() {
		return new Trainer("John", "Gordon");
	}

}
