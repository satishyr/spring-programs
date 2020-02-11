package com.app.bean;

import java.util.List;
import java.util.Map;

public class Employee {
	private int empid;
	private List<String> empprjs;
	private Map<Integer,String> empaddrs;
	public Employee() {
		super();
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public List<String> getEmpprjs() {
		return empprjs;
	}
	public void setEmpprjs(List<String> empprjs) {
		this.empprjs = empprjs;
	}
	public Map<Integer, String> getEmpaddrs() {
		return empaddrs;
	}
	public void setEmpaddrs(Map<Integer, String> empaddrs) {
		this.empaddrs = empaddrs;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empprjs=" + empprjs + ", empaddrs=" + empaddrs + "]";
	}
	
	

}
