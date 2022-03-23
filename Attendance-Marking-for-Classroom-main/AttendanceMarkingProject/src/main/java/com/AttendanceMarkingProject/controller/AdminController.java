package com.AttendanceMarkingProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.AttendanceMarkingProject.model.Admin;
import com.AttendanceMarkingProject.serviceImpl.AdminServiceImpl;

@Controller
public class AdminController {
	
	@Autowired
	AdminServiceImpl as;
	
	private static Admin modelAdmin=null;
	
	public static void setModelAdmin(Admin admin)
	{
		modelAdmin=admin;
	}
	
	@GetMapping("adminhome")
	public String adminhome(){
		return "./Admin/AdminHome";
	}
	
	@GetMapping("adminlogin")
	public String adminLogin() {
		return "./Admin/Adminlogin";
	}
	
	@GetMapping("adminreg")
	public String adminRegistration(){
		return "./Admin/AdminReg";
	}
	
	@GetMapping("resetpassword")
	public String resetPassword() {
		return "./Admin/PasswordReset";
	}
	
	@PostMapping("resetsPassword")
	public String reset(@RequestParam String validation1,@RequestParam String validation2,
			@RequestParam String validation3,@RequestParam String email,@RequestParam String password,@RequestParam String number,Model m) 
	{
		String pass = as.passwordrecovery(validation1, validation2, validation3, number, email, password);
		m.addAttribute("msg", pass);
		return "./Admin/PasswordReset";
	}
	
	@PostMapping("adminloginprocess")
	public String adminLoginProcess(@RequestParam int adminid,@RequestParam String password,Model m) {
		Admin admin=as.validateAdmin(adminid, password);
		setModelAdmin(admin);
		if(modelAdmin!=null)
		{
			if(modelAdmin.getApproval().equals("Pending"))
			{
				m.addAttribute("msg","Approval pending");
				setModelAdmin(null);
				return "./Admin/Adminlogin";
			}
			else if(modelAdmin.getApproval().equals("Rejected"))
			{
				m.addAttribute("msg","Registration rejected! Kindly register again");
				setModelAdmin(null);
				return "./Admin/Adminlogin";
			}
			else
			{
				return "./Admin/AdminHome";
			}
		}
		m.addAttribute("msg","Wrong id/password");
		return "./Admin/Adminlogin";
	}
	
	
	@PostMapping("adminregprocess")
	public String adminRegProcess(@RequestParam String firstname,@RequestParam String lastname,@RequestParam int age,
			@RequestParam String gender,@RequestParam String email,@RequestParam String number,@RequestParam String password,@RequestParam String validation1,
			@RequestParam String validation2,
			@RequestParam String validation3,
			Model m) {
		Admin adm = new Admin(firstname,lastname,age,gender,email,number,password,validation1,validation2,validation3);
		adm.setApproval("Pending");
		String res = as.registerAdmin(adm);
		m.addAttribute("msg",res);
		return "./Admin/AdminReg";
	}

}