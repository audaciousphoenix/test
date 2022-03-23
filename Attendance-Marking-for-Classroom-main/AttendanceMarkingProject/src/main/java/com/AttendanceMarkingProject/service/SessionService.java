package com.AttendanceMarkingProject.service;

import java.util.List;

import com.AttendanceMarkingProject.model.Session;

public interface SessionService {

	public String addSession(Session session);
	public Session searchSession(int sessionId);
	public List<Session> showSession();
	public String updateSession(Session session);
	public List<Session> searchBySKillType(String skillType);
	
}
