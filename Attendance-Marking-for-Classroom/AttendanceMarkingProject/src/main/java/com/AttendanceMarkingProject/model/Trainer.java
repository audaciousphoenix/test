package com.AttendanceMarkingProject.model;

public class Trainer {
	private int trainerId;
	private String trainerName;
	private String contactNumber;
	private String email;
	private String skillSet;
	public int getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSkillSet() {
		return skillSet;
	}
	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}
	public Trainer(int trainerId, String trainerName, String contactNumber, String email,
			String skillSet) {
		super();
		
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.contactNumber = contactNumber;
		this.email = email;
		this.skillSet = skillSet;
	}
	public Trainer() {
		super();
	}
	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", trainerName=" + trainerName
				+ ", contactNumber=" + contactNumber + ", email=" + email + ", skillSet=" + skillSet + "]";
	}
	

}
