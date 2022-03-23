package com.AttendanceMarkingProject.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.AttendanceMarkingProject.model.Skill;
import com.AttendanceMarkingProject.service.SkillService;

@Component
public class SkillServiceImpl implements SkillService {

	@Autowired
	JdbcTemplate jt;
	
	@Override
	public String addSkill(Skill skill) {
	
		
		// TODO Auto-generated method stub
		String sql = "Insert into skillset(skillid,skilltype,skilldes) values(?,?,?);";
		int r = jt.update(sql,new Object[] {skill.getSkillId(), skill.getSkillType(),skill.getSkillDesc()});
		if(r>=1)
			return "Skill Added";
		else
			return "Error....";
		
		
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Skill> showSkill() {
		// TODO Auto-generated method stub
		
		List<Skill> sklist = new ArrayList<>();
		String str = "select * from  skillset";
		
		sklist=jt.query(str, new BeanPropertyRowMapper(Skill.class));
		return sklist;
		
		
		
	}

}
