package com.app.model;

public class Side {

	private int sid;
	private String sname;
	public Side() {
		super();
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Side [sid=" + sid + ", sname=" + sname + "]";
	}
	
}
