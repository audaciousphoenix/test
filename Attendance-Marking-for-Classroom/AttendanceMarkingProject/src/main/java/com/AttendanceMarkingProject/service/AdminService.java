package com.AttendanceMarkingProject.service;

import java.util.List;

import com.AttendanceMarkingProject.model.Admin;

public interface AdminService {
	public String registerAdmin(Admin admin);
	public Admin validateAdmin(int adminId,String password);
	public List<Admin> showregadmins();
	public String passwordrecovery(String validation1,String validation2,String validation3,String number,String firstName,String password);
	public String approveEnrollment(int sNo);
	public String rejectEnrollment(int sNo);
}
