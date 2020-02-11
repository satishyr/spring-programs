package com.app.bean;

public class Version {

	private int vid;
	private String vcode;
	public Version() {
		super();
	}
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVcode() {
		return vcode;
	}
	public void setVcode(String vcode) {
		this.vcode = vcode;
	}
	@Override
	public String toString() {
		return "Version [vid=" + vid + ", vcode=" + vcode + ", getVid()=" + getVid() + ", getVcode()=" + getVcode()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
