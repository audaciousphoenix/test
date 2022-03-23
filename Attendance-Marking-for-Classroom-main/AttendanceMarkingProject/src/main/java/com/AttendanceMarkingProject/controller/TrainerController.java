package com.AttendanceMarkingProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.AttendanceMarkingProject.model.Skill;
import com.AttendanceMarkingProject.model.Trainer;
import com.AttendanceMarkingProject.service.SkillService;
import com.AttendanceMarkingProject.serviceImpl.TrainerServiceImpl;

@Controller
public class TrainerController {
	@Autowired
	TrainerServiceImpl ts;
	
	@Autowired
	SkillService ss;
	
	
	@GetMapping("trainerreg")
	public String trainerReg(Model m){
		
		List<Skill> slist = ss.showSkill();
		m.addAttribute("slist",slist);
		return "TrainerReg";
	}
	@GetMapping("updatetrainer")
	public String updateTrainerPage(Model m){
		
		List<Skill> slist = ss.showSkill();
		m.addAttribute("slist",slist);
		
		List<Trainer> tlist = ts.showTrainer();
		m.addAttribute("tlist",tlist);
		
		return "UpdateTrainer";
	}
	@GetMapping("deletetrainer")
	public String deleteTrainerPage(Model m){
		List<Trainer> tlist = ts.showTrainer();
		m.addAttribute("tlist",tlist);
		return "DeleteTrainer";
	}
	
	
	@PostMapping("trainerregprocess")
	public String trainerregprocess(@RequestParam int trainerId,@RequestParam String trainerName,@RequestParam String contactNumber,
			@RequestParam String email,@RequestParam String skillSet,
			Model m) {
		Trainer trn = new Trainer(trainerId,trainerName,contactNumber,email,skillSet);
		String res = ts.addTrainer(trn);
		m.addAttribute("msg",res);
		List<Skill> slist = ss.showSkill();
		m.addAttribute("slist",slist);
		return "TrainerReg";
	
}
	@PostMapping("trainerupdateprocess")
	public String UpdateTrainerDetails(@RequestParam int trainerId,@RequestParam String trainerName,@RequestParam String contactNumber,
			@RequestParam String email,@RequestParam String skillSet,
			Model m )
	{
		Trainer t = new Trainer(trainerId,trainerName,contactNumber,email,skillSet);
	
		
		String res = ts.updateTrainer(t);
		m.addAttribute("msg",res);
		List<Skill> slist = ss.showSkill();
		m.addAttribute("slist",slist);
		
		List<Trainer> tlist = ts.showTrainer();
		m.addAttribute("tlist",tlist);
		
		return "UpdateTrainer";

	}
	
	@PostMapping("trainerdeletionprocess")
	public String DeleteTrainerDetails(@RequestParam String trainerId,
			Model m )
	{
		Trainer t = new Trainer();
		t.setTrainerId(Integer.parseInt(trainerId));
		String res = ts.deleteTrainer(t);
		m.addAttribute("msg",res);
		List<Trainer> tlist = ts.showTrainer();
		m.addAttribute("tlist",tlist);
		return "DeleteTrainer";
		
		
		
	}
}
