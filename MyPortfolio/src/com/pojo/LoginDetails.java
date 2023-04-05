package com.pojo;

public class LoginDetails {

	private int sn;
	private String userid;
	private String password;
	
	public LoginDetails()
	{
		
	}
	public LoginDetails(int sn, String userid, String password) {
		super();
		this.sn = sn;
		this.userid = userid;
		this.password = password;
	}
	public int getSn() {
		return sn;
	}
	public void setSn(int sn) {
		this.sn = sn;
	}
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
		return "LoginDetails [sn=" + sn + ", userid=" + userid + ", password=" + password + "]";
	}
	
}
