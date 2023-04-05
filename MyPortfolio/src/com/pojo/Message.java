package com.pojo;

public class Message {

	private int sn;
	private String name;
	private String email;
	private String message;
	
	public Message(int sn, String name, String email, String message) {
		super();
		this.sn = sn;
		this.name = name;
		this.email = email;
		this.message = message;
	}
	
	
	public Message() {
	
		// TODO Auto-generated constructor stub
	}


	public int getSn() {
		return sn;
	}
	public void setSn(int sn) {
		this.sn = sn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Message [sn=" + sn + ", name=" + name + ", email=" + email + ", message=" + message + "]";
	}
	
	
}
