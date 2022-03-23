package com.AttendanceMarkingProject.model;

public class User {
	private String firstName;
	private String lastName;
	private int empId;
	private String email;
	private String number;
	private String password;
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
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
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
	public User()
	{
		super();
	}
	public User(String firstName, String lastName, String email,String number, String password,String validation1,String validation2,String validation3) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.number = number;
		this.password = password;
		this.validation1 = validation1;
		this.validation2 = validation2;
		this.validation3 = validation3;
	}
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", empId=" + empId + ", email=" + email+ ", number=" + number
				+ ", password=" + password + ", validation1=" + validation1 + ", validation2=" + validation2
				+ ", validation3=" + validation3 + "]";
	}

}
