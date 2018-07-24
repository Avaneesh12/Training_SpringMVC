package com.cg.training.service;

import java.util.List;

import com.cg.training.beans.Trainee;


public interface TraineeService 
{
	
		public Trainee addTrainee(Trainee trainee);
		
		public Trainee getTrainee(int id) ;
		
		public Trainee updateTrainee(Trainee trainee);
		
		public void removeTrainee (Trainee trainee) ;
		
		public List<Trainee> getAllTrainees();

}
