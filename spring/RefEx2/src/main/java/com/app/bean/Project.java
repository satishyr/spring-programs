package com.app.bean;

public class Project {
	private int pid;
	private String pnme;
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
	public String getPnme() {
		return pnme;
	}
	public void setPnme(String pnme) {
		this.pnme = pnme;
	}
	public Version getVer() {
		return ver;
	}
	public void setVer(Version ver) {
		this.ver = ver;
	}
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pnme=" + pnme + ", ver=" + ver + "]";
	}
	

}
