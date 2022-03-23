package com.AttendanceMarkingProject.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.AttendanceMarkingProject.service.SuperUserService;

@Component
public class SuperUserServiceImpl implements SuperUserService {

	@Autowired
	JdbcTemplate jt;
	
	@Override
	public String approveAdmin(int adminId) {
		String str="update adminreg set approval=? where adminid=?;";
		try
		{
			int res=jt.update(str, new Object[] {"Approved",adminId});
			if(res>=1)
			{
				return "Admin approved";
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return "Approval error!";
	}

	@Override
	public String rejectAdmin(int adminId) {
		String str="update adminreg set approval=? where adminid=?;";
		try
		{
			int res=jt.update(str, new Object[] {"Rejected",adminId});
			if(res>=1)
			{
				return "Admin rejected";
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return "Rejection error!";
	}

}
