package com.AttendanceMarkingProject.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.AttendanceMarkingProject.model.Session;
import com.AttendanceMarkingProject.model.User;
import com.AttendanceMarkingProject.service.UserService;

@Component
public class UserServiceImpl implements UserService {
	
	@Autowired
	JdbcTemplate jt;

	@Override
	public String registeruser(User user) {
		String str="insert into userreg(firstname,lastname,empid,email,password) values(?,?,?,?,?);";
		try
		{
			int res=jt.update(str, new Object[] {user.getFirstName(),user.getLastName(),user.getEmpId(),user.getEmail(),user.getPassword()});
			if(res>=1)
			{
				return "User added successfully";
			}
			else
			{
				return "User not added!";
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return "User not added!";
	}

	@SuppressWarnings({ "deprecation", "unchecked", "rawtypes" })
	@Override
	public User validateUser(int empId, String password) {
		String str="select * from userreg where empId=? and password=?;";
		try
		{
			User user=(User) jt.queryForObject(str, new Object[] {empId,password}, new BeanPropertyRowMapper(User.class));
			return user;
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return null;
	}

	@Override
	public String enrollUser(int empId, int sessionId) {
		
		String str1="select sno from enrolldet where empid=? and sessionid=?;";
		try
		{
			int r=jt.queryForObject(str1, new Object[] {empId,sessionId},Integer.class);
			if(r>=1)
			{
				return "You have already enrolled!";
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
		String str2="insert into enrolldet(empid,sessionid,attendance,approval) values(?,?,?,?);";
		try
		{
			int r=jt.update(str2, new Object[] {empId,sessionId,"null","Pending"});
			if(r>=1)
			{
				return "You are successfully enrolled!";
			}
			else
			{
				return "Error enrolling";
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return "Error enrolling";
	}
}
