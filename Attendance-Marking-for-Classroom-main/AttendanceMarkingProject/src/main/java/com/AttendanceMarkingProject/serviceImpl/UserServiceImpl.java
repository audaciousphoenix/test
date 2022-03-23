package com.AttendanceMarkingProject.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.AttendanceMarkingProject.model.User;
import com.AttendanceMarkingProject.service.UserService;

@Component
public class UserServiceImpl implements UserService {
	
	@Autowired
	JdbcTemplate jt;

	@Override
	public String registeruser(User user) {
		String str="insert into userreg(firstname,lastname,empid,email,number,password,vaildation1,validation2,validation3) values(?,?,?,?,?,?,?,?,?);";
		try
		{
			int res=jt.update(str, new Object[] {user.getFirstName(),user.getLastName(),user.getEmpId(),user.getEmail(),user.getNumber(),
					user.getPassword(),user.getValidation1(),user.getValidation2(),user.getValidation3()});
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

	@SuppressWarnings("deprecation")
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

	@Override
	public String passwordrecovery(String validation1, String validation2, String validation3, String number,
			String email, String password) {
		String str = "update userreg set password = ? where validation1= ? and validation2 =? and validation3 = ? and email = ? and number = ?";
		try {
			int pass = jt.update(str,new Object[] {password,validation1,validation2,validation3,email,number});
			if(pass>=1) {
				return "Password Reseted Successfully";
			}else {
				return "Error Reseting. Please try again";
			}
		}catch(Exception ex) {
			ex.getMessage();
		}
	return "Error Reseting. Please try again";
	}
}
