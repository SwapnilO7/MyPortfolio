package com.dao;

import java.util.ArrayList;

import com.pojo.Education;
import com.pojo.Experience;
import com.pojo.LoginDetails;
import com.pojo.Message;
import com.pojo.Project;

public interface ReadDao {

	public ArrayList<Message> readAllMessage();
	public String login(String userid,String password);
	public LoginDetails getLoginDetails();
	ArrayList<Project> getProjectDetails();
	public ArrayList<Experience> readAllExperience();
	public ArrayList<Education> readAllEducation();
}
