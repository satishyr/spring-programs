package com.app.bean;

public class Project {
	private Version ver;

	public Project() {
		super();
	}

	public Version getVer() {
		return ver;
	}

	public void setVer(Version ver) {
		this.ver = ver;
	}

	@Override
	public String toString() {
		return "Project [ver=" + ver + "]";
	}

	public Project(Version ver) {
		super();
		this.ver = ver;
	}
	

}
