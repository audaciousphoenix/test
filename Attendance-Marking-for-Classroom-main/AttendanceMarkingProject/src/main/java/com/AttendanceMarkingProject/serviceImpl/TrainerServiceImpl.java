package com.AttendanceMarkingProject.serviceImpl;

import com.AttendanceMarkingProject.model.Trainer;
import com.AttendanceMarkingProject.service.TrainerService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;



@Component
public class TrainerServiceImpl implements TrainerService {
	
	@Autowired
	JdbcTemplate jt;

	@Override
	public String addTrainer(Trainer trainer) {
		// TODO Auto-generated method stub
		
		String sql = "insert into trainerreg(trainerid,trainername,contactnumber,email,skillset) values(?,?,?,?,?);";
		try {
		int r = jt.update(sql, new Object[] {trainer.getTrainerId(),trainer.getTrainerName(),trainer.getContactNumber(),trainer.getEmail(),trainer.getSkillSet()});
		if(r>=1)
			return "Trainer Added";
		else
			return "Error....";
	}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return "Error..";
	}
	
	@Override
	public String updateTrainer(Trainer utrainer) {
		// TODO Auto-generated method stub
		String sql = "update trainerreg set trainerName=?,contactNumber=?,email=?,skillset=?  where trainerId=? ;";
		try {
			int r = jt.update(sql, new Object[] {utrainer.getTrainerName(),utrainer.getContactNumber(),utrainer.getEmail(),utrainer.getSkillSet(),utrainer.getTrainerId()});
			if(r>=1)
				return "Trainer Updated";
			else
				return "Error updating!";
		}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
			return "Error updating!";
		}

	@Override
	public String deleteTrainer(Trainer dtrainer) {
		String sql="delete from trainerreg where trainerId=?;";
		try
		{
			int r=jt.update(sql, new Object[] {dtrainer.getTrainerId()});
			if(r>=1)
				return "Deletion successful!";
			else
				return "Trainer not found!";
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return "Trainer not found!";
	}

	@Override
	public List<Trainer> showTrainer() {
		List<Trainer> tlist = new ArrayList<>();
		String str = "select * from  trainerreg";
		try
		{
			tlist=jt.query(str, new BeanPropertyRowMapper(Trainer.class));
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return tlist;
		
	}
	}
		
		
		
	
	
