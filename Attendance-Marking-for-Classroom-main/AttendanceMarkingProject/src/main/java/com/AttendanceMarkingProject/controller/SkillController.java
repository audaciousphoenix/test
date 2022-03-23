package com.AttendanceMarkingProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.AttendanceMarkingProject.model.Skill;
import com.AttendanceMarkingProject.service.SkillService;

@Controller
public class SkillController {

	@Autowired
	SkillService ss;
	
	@GetMapping("skilladd")
	public String skillAdd(Model m) {
		return "SkillAdd";
	}
	
	@PostMapping("addSk")
	public String skillAdd(@RequestParam String skillId,
			@RequestParam String skillType,
			@RequestParam String skillDesc,
			Model m) {
		
		Skill sk = new Skill();
		sk.setSkillId(Integer.parseInt(skillId));
		sk.setSkillType(skillType);
		sk.setSkillDesc(skillDesc);
		
		String res = ss.addSkill(sk);
		m.addAttribute("msg",res);
		
		return "SkillAdd";
	}

	
}
