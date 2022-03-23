package com.AttendanceMarkingProject.model;

public class Admin {
	private String firstName;
	private String lastName;
	private int age;
	private String gender;
	private String number;
	private int adminId;
	private String password;
	private String approval;
	private String validation1;
	private String validation2;
	private String validation3;
	

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getValidation1() {
		return validation1;
	}
	public void setValidation1(String validation1) {
		this.validation1 = validation1;
	}
	public String getValidation2() {
		return validation2;
	}
	public void setValidation2(String validation2) {
		this.validation2 = validation2;
	}
	public String getValidation3() {
		return validation3;
	}
	public void setValidation3(String validation3) {
		this.validation3 = validation3;
	}
	
	public String getApproval() {
		return approval;
	}
	public void setApproval(String approval) {
		this.approval = approval;
	}
	public Admin(String firstName, String lastName, int age, String gender, String number, String password,String validation1,String validation2,String validation3) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.number = number;
		this.password = password;
		this.validation1 = validation1;
		this.validation2 = validation2;
		this.validation3 = validation3;
	}
	
	public Admin() {
		super();
	}
	
	@Override
	public String toString() {
		return "Admin [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", gender=" + gender
				+ ", number=" + number + ", adminId=" + adminId + ", password=" + password + ", approval=" + approval
				+ ", validation1=" + validation1 + ", validation2=" + validation2 + ", validation3=" + validation3
				+ "]";
	}

}
