package com.AttendanceMarkingProject.model;

public class Session {

	private int sessionId;
	private String sessionDes;
	private String skillSet;
	private String sessionDate;
	private String sessionTime;
	private int availSlots;
	public int getSessionId() {
		return sessionId;
	}
	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}
	public String getSessionDes() {
		return sessionDes;
	}
	public void setSessionDes(String sessionDes) {
		this.sessionDes = sessionDes;
	}
	public String getSkillSet() {
		return skillSet;
	}
	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}
	public String getSessionDate() {
		return sessionDate;
	}
	public void setSessionDate(String sessionDate) {
		this.sessionDate = sessionDate;
	}
	public String getSessionTime() {
		return sessionTime;
	}
	public void setSessionTime(String sessionTime) {
		this.sessionTime = sessionTime;
	}
	public int getAvailSlots() {
		return availSlots;
	}
	public void setAvailSlots(int availSlots) {
		this.availSlots = availSlots;
	}
	
	
	
	
}
