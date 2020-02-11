package com.app.bean;

import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;

public class Student {
    
	private String sname;
	private Set<String> scourse;
	private Map<Integer,String> saddr;
	private Course cobj;
	public Student() {
		super();
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Set<String> getScourse() {
		return scourse;
	}
	public void setScourse(Set<String> scourse) {
		this.scourse = scourse;
	}
	public Map<Integer, String> getSaddr() {
		return saddr;
	}
	public void setSaddr(Map<Integer, String> saddr) {
		this.saddr = saddr;
	}
	public Course getCobj() {
		return cobj;
	}
	public void setCobj(Course cobj) {
		this.cobj = cobj;
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", scourse=" + scourse + ", saddr=" + saddr + ", cobj=" + cobj + "]";
	}
	
}
