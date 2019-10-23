package com.qa.business;

import java.util.List;

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
	
	public List<Trainer> getAllTrainer() {
		return trainerRepo.findAll();
	}

	public Trainer addNewTrainer(Trainer trainer) {
		return trainerRepo.save(trainer);
	}

	public Trainer updateTrainer(Trainer trainer) {
		return trainerRepo.save(trainer);
	}

	public String deleteTrainer(Long id) {
		trainerRepo.deleteById(id);
		return "Trainer succesfully deleted";
	}
}
