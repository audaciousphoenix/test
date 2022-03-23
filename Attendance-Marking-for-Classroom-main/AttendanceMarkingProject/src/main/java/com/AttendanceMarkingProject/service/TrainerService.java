package com.AttendanceMarkingProject.service;

import java.util.List;


import com.AttendanceMarkingProject.model.Trainer;

public interface TrainerService {
	
	public String addTrainer(Trainer trainer);
	public String updateTrainer(Trainer trainer);
	public String deleteTrainer(Trainer dtrainer);
	public List<Trainer> showTrainer();
}
