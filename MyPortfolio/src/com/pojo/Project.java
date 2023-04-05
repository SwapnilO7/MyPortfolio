package com.pojo;

public class Project {

	private int sn;
	private String filename;
	public int getSn() {
		return sn;
	}
	public void setSn(int sn) {
		this.sn = sn;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	@Override
	public String toString() {
		return "Project [sn=" + sn + ", filename=" + filename + "]";
	}
	public Project(int sn, String filename) {
		super();
		this.sn = sn;
		this.filename = filename;
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
