package com.cg.training.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.training.beans.Trainee;

public interface TraineeRepo extends JpaRepository<Trainee, Integer>{

}
