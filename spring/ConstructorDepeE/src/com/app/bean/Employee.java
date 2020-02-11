package com.app.bean;

import java.util.Properties;
import java.util.Set;

public class Employee {
	private int empid;
	private String empname;
	private double empsal;
	private Set<String> empcourses;
	private Properties prjs;
	
	public Employee(int empid, String empname, double empsal, Set<String> empcourses, Properties prjs) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
		this.empcourses = empcourses;
		this.prjs = prjs;
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
	public Set<String> getEmpcourses() {
		return empcourses;
	}
	public void setEmpcourses(Set<String> empcourses) {
		this.empcourses = empcourses;
	}
	public Properties getPrjs() {
		return prjs;
	}
	public void setPrjs(Properties prjs) {
		this.prjs = prjs;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + ", empcourses=" + empcourses
				+ ", prjs=" + prjs + "]";
	}

}
