package com.ProjectD.persistance.data;

import org.springframework.data.annotation.Id;

public class User {
	
	@Id
	Long ID;
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID =  iD;
	}
	String fname;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	String lname;
	String username;
	String password;

}
