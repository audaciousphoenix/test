package com.AttendanceMarkingProject.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.AttendanceMarkingProject.model.Session;
import com.AttendanceMarkingProject.model.Skill;
import com.AttendanceMarkingProject.service.SessionService;

@Component
public class SessionServiceImpl implements SessionService {

	@Autowired
	JdbcTemplate jt;
	
	@Override
	public String addSession(Session session) {
		String sql = "Insert into sessiondet(sessionid,sessiondes,skillset,sessiondate,sessiontime,availslots) values(?,?,?,?,?,?);";
		try
		{
			int r = jt.update(sql, new Object[] {session.getSessionId(),session.getSessionDes(),session.getSkillSet(),session.getSessionDate(),session.getSessionTime(),session.getAvailSlots()});
			if(r>=1)
				return "Session Added";
			else
				return "Error...";
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return "Error...";
	}

	@Override
	public Session searchSession(int sessionId) {
		
		String str = "Select * from sessiondet where sessionid=?;";
		try {
			Session session=(Session) jt.queryForObject(str, new Object[] {sessionId}, new BeanPropertyRowMapper(Session.class));
			return session;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return null;
	}

	/**
	 *
	 */
	@Override
	public List<Session> showSession() {
		List<Session> nlist =  new ArrayList<>();
		String str = "select * from sessiondet";
		
		nlist=jt.query(str, new BeanPropertyRowMapper(Session.class));
		return nlist;	
	}

	@Override
	public String updateSession(Session session) {

		String sql = "update sessiondet set sessiondes=?,skillset=?,sessiondate=?,sessiontime=?,availslots=?  where sessionid=? ;";
		try {
			int r = jt.update(sql, new Object[] {session.getSessionDes(),session.getSkillSet(),session.getSessionDate(),session.getSessionTime(),session.getAvailSlots(),session.getSessionId()});
			if(r>=1)
				return "Session Updated";
			else
				return "Error....";
			}
		catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
		return "Error..";
		
	}

	@Override
	public List<Session> searchBySKillType(String skillType) {
		String sql = "Select * from sessiondet where skillset=?";
		List<Session> ss= new ArrayList<>();
		try
		{
			ss = jt.query(sql, new Object[] {skillType}, new BeanPropertyRowMapper(Session.class));
		}
		catch(Exception ex)
		{
			ss = null;
		}
		return ss;
	}

}
