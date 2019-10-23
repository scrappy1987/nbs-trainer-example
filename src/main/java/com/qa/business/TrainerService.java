package com.qa.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.persistence.domain.Trainer;
import com.qa.persistence.repository.TrainerRepository;

@Service
public class TrainerService {

	@Autowired
	private TrainerRepository trainerRepo;
	
	public TrainerService() {

	}	
	
	public Trainer getAllTrainer() {
		return trainerRepo.getAllTrainer();
	}

	public Trainer addNewTrainer() {
		return trainerRepo.addNewTrainer();
	}

	public Trainer updateTrainer() {
		return trainerRepo.updateTrainer();
	}

	public Trainer deleteTrainer() {
		return trainerRepo.deleteTrainer();
	}
}
