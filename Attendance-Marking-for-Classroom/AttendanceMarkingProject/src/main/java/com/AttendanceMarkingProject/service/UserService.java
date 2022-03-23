package com.AttendanceMarkingProject.service;

import com.AttendanceMarkingProject.model.User;

public interface UserService {
	public String registeruser(User user);
	public User validateUser(int empId,String password);
	public String enrollUser(int empId,int sessionId);
}