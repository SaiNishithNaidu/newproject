package com.example.Project.Model;

public class loginModel {

	private String userid;
	private String password;
	
	

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "loginModel [userid=" + userid + ", password=" + password + "]";
	}
	

}
