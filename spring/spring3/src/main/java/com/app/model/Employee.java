package com.app.model;

public class Employee {
	private int empid;
	private String empname;
	private double empsal;
	private String empaddr;
	
	public Employee() {
		super();
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getEmpsal() {
		return empsal;
	}
	public void setEmpsal(double empsal) {
		this.empsal = empsal;
	}
	public String getEmpaddr() {
		return empaddr;
	}
	public void setEmpaddr(String empaddr) {
		this.empaddr = empaddr;
	}
	@Override
	public String toString() {
		return "Student [empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + ", empaddr=" + empaddr + "]";
	}
	

}
