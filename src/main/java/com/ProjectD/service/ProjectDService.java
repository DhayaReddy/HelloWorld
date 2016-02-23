package com.ProjectD.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ProjectD.persistance.data.User;
import com.ProjectD.repository.ProjectRepository;
@Component
public class ProjectDService {
	@Autowired
	ProjectRepository pr;
	public String signUp(User user)
	
	{
		
		pr.save(user);
		return ""+user.getID();
	}

}
