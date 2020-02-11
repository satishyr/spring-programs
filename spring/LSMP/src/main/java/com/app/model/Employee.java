package com.app.model;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
	private int empid;
	private List<String> empnames;
	private Set<String> empcodes;
	private Map<String,String> empcourses;
	private Properties empSals;
	public Employee() {
		super();
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public List<String> getEmpnames() {
		return empnames;
	}
	public void setEmpnames(List<String> empnames) {
		this.empnames = empnames;
	}
	public Set<String> getEmpcodes() {
		return empcodes;
	}
	public void setEmpcodes(Set<String> empcodes) {
		this.empcodes = empcodes;
	}
	public Map<String, String> getEmpcourses() {
		return empcourses;
	}
	public void setEmpcourses(Map<String, String> empcourses) {
		this.empcourses = empcourses;
	}
	public Properties getEmpSals() {
		return empSals;
	}
	public void setEmpSals(Properties empSals) {
		this.empSals = empSals;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empnames=" + empnames + ", empcodes=" + empcodes + ", empcourses="
				+ empcourses + ", empSals=" + empSals + "]";
	}
	


}
