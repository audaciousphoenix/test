package com.AttendanceMarkingProject.service;

import java.util.List;

import com.AttendanceMarkingProject.model.Skill;

public interface SkillService {

	public String addSkill(Skill skill);
	
	public List<Skill> showSkill();
}
