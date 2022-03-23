package com.AttendanceMarkingProject.controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.AttendanceMarkingProject.model.Session;
import com.AttendanceMarkingProject.model.Skill;
import com.AttendanceMarkingProject.model.User;
import com.AttendanceMarkingProject.serviceImpl.SessionServiceImpl;
import com.AttendanceMarkingProject.serviceImpl.SkillServiceImpl;
import com.AttendanceMarkingProject.serviceImpl.UserServiceImpl;

@Controller
public class UserController {
	
	@Autowired
	UserServiceImpl us;
	
	@Autowired
	SkillServiceImpl ssi;
	
	@Autowired
	SessionServiceImpl sei;
	
	private static User modelUser=null;
	
	public static void setModelUser(User user)
	{
		modelUser=user;
	}
	
	@GetMapping("Userlogin")
	public String userLogin()
	{
		return "./User/Userlogin";
	}
	
	@GetMapping("Userreg")
	public String userRegistration()
	{
		return "./User/Userreg";
	}
	
	@GetMapping("showAllSessions")
	public String showallsessions(Model m) {
		
		List<Session> slist = sei.showSession();
		m.addAttribute("slist",slist);
		
		List<Skill> sklist=ssi.showSkill();
		m.addAttribute("sklist", sklist);
		
		return "ShowAllSessions";
	}
	
  @PostMapping("showsessiondetails")
	public String showSessionDetails(@RequestParam int sid,Model m)
	{
		List<Session> slist = sei.showSession();
		m.addAttribute("slist",slist);
		
		Session res=sei.searchSession(sid);
		List<Session> reslist=new ArrayList<>();
		reslist.add(res);
		m.addAttribute("dlist", reslist);
		
		List<Skill> sklist=ssi.showSkill();
		m.addAttribute("sklist", sklist);
		
		return "ShowAllSessions";
	}
  
  	@PostMapping("searchsessionbyid")
    public String searchSessionById(@RequestParam int selectId,Model m)
    {
  		
		List<Session> slist = sei.showSession();
		m.addAttribute("slist",slist);
		
		Session res=sei.searchSession(selectId);
		List<Session> reslist=new ArrayList<>();
		reslist.add(res);
		m.addAttribute("dlist", reslist);
		
		List<Skill> sklist=ssi.showSkill();
		m.addAttribute("sklist", sklist);
	  	
	    return "ShowAllSessions";
    }
  	
  	@PostMapping("searchsessionbyskill")
  	 public String searchSessionBySkill(@RequestParam String selectSkill,Model m)
    {
		List<Session> reslist=sei.searchBySKillType(selectSkill);
		m.addAttribute("slist", reslist);
		
		List<Skill> sklist=ssi.showSkill();
		m.addAttribute("sklist", sklist);
	  	
	    return "ShowAllSessions";
    }
		
	@PostMapping("userregprocess")
	public String userRegProcess(@RequestParam String firstname,@RequestParam String lastname,
			@RequestParam String email,@RequestParam String password,@RequestParam String validation1,@RequestParam String validation2,
			@RequestParam String validation3,Model m)
	{
		User usr = new User(firstname,lastname,email,password,validation1,validation2,validation3);
		String res=us.registeruser(usr);
		m.addAttribute("msg", res);
		return "./User/Userreg";
	}
	
	@PostMapping("userloginprocess")
	public String userLoginProcess(@RequestParam int userid,@RequestParam String password,Model m)
	{
		User user=us.validateUser(userid, password);
		setModelUser(user);
		if(modelUser!=null)
		{
			return "./User/UserHome";
		}
		m.addAttribute("msg","Wrong id/password");
		return "./User/Userlogin";
	}
	
	@PostMapping("enrollaction")
	public String enrollment(Model m,@RequestParam int enrollid)
	{
		String res=us.enrollUser(modelUser.getEmpId(), enrollid);
		m.addAttribute("msg", res);
		
		List<Session> slist = sei.showSession();
		m.addAttribute("slist",slist);
		
		List<Skill> sklist=ssi.showSkill();
		m.addAttribute("sklist", sklist);
		
		return "ShowAllSessions";
	}
}
