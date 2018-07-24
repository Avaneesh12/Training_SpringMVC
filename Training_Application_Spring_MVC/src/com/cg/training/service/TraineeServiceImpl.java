package com.cg.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.cg.training.beans.Trainee;
import com.cg.training.repo.TraineeRepo;

@Component(value="traineeService")
public class TraineeServiceImpl implements TraineeService{

	@Autowired
	TraineeRepo repo;
	
	@Override
	public Trainee addTrainee(Trainee trainee) {
		
		return repo.save(trainee);
	}

	@Override
	public Trainee getTrainee(int id) {
		
		return repo.findOne(id);
	}

	@Override
	public Trainee updateTrainee(Trainee trainee) {
		
		 return repo.save(trainee);
	}

	@Override
	public void removeTrainee(Trainee trainee) {
		
		repo.delete(trainee);
	}

	@Override
	public List<Trainee> getAllTrainees() {
		List<Trainee> trainee = repo.findAll();
		return trainee;
	}

}
