package com.app.bean;

public class Project {
	private int pid;
	private String pname;
    private Version ver;
	public Project() {
		super();
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Version getVer() {
		return ver;
	}
	public void setVer(Version ver) {
		this.ver = ver;
	}
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pname=" + pname + ", ver=" + ver + "]";
	}
	    

}
