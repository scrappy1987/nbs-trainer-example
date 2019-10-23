package com.qa.persistence.repository;

import org.springframework.stereotype.Repository;

import com.qa.persistence.domain.Trainer;

@Repository
public class TrainerRepository {
	
	public TrainerRepository() {
		
	}
	
	public Trainer getAllTrainer() {
		return new Trainer("Jack", "Gordon");
	}

	public Trainer addNewTrainer() {
		return new Trainer("Jack", "Gordon");
	}

	public Trainer updateTrainer() {
		return new Trainer("Jack", "Gordon");
	}

	public Trainer deleteTrainer() {
		return new Trainer("Jack", "Gordon");
	}
}
