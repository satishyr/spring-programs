package com.app.model;

public class Employee {
	private int eid;
	private String ename;
	private Address aob;
	public Employee() {
		super();
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Address getAob() {
		return aob;
	}
	public void setAob(Address aob) {
		this.aob = aob;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", aob=" + aob + "]";
	}
	
	

}
