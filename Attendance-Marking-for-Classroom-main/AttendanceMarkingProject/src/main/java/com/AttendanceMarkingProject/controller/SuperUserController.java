package com.AttendanceMarkingProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.AttendanceMarkingProject.model.Admin;
import com.AttendanceMarkingProject.serviceImpl.AdminServiceImpl;
import com.AttendanceMarkingProject.serviceImpl.SuperUserServiceImpl;

@Controller
public class SuperUserController{
	
	@Autowired
	AdminServiceImpl as;
	
	@Autowired
	SuperUserServiceImpl sus;
	
	@GetMapping("Superlogin")
	public String Login() {
		return "./SuperUser/SuperUser";
	}
	
	@GetMapping("superuserhome")
	public String home() {
		return "./SuperUser/SuperUserHome";
	}
	
	@PostMapping("superuserlogin")
	public String Login1(@RequestParam String userName,@RequestParam String password,Model m) {
		if(userName.equals("superuser")&&password.equals("superuser@123")) {
			return "./SuperUser/SuperUserHome";
		}else {
			m.addAttribute("msg","Wrong username or password");
			return "./SuperUser/SuperUser";
		}
	}
	
	@GetMapping("taskpage")
	public String task(Model m) {
		List<Admin> alist = as.showregadmins();
		m.addAttribute("alist",alist);
		return "./SuperUser/TaskPage";
	}
	
	@RequestMapping(value="doaction",params="approve",method=RequestMethod.POST)
	public String doApprove(@RequestParam(name="aid") String adminId,Model m)
	{
		sus.approveAdmin(Integer.parseInt(adminId));
		List<Admin> alist = as.showregadmins();
		m.addAttribute("alist",alist);
		return "./SuperUser/TaskPage";
	}
	
	@RequestMapping(value="doaction",params="reject",method=RequestMethod.POST)
	public String doReject(@RequestParam(name="aid") String adminId,Model m)
	{
		sus.rejectAdmin(Integer.parseInt(adminId));
		List<Admin> alist = as.showregadmins();
		m.addAttribute("alist",alist);
		return "./SuperUser/TaskPage";
	}
}