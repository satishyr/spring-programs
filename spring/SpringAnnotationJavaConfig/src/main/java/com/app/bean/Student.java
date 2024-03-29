package com.app.bean;

import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("sobj")
public class Student {
	@Value("${sname}")
	private String sname;
	private Set<String> scours;
	private Map<Integer,String> saddr;
	@Autowired
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
	public Set<String> getScours() {
		return scours;
	}
	public void setScours(Set<String> scours) {
		this.scours = scours;
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
		return "Student [sname=" + sname + ", scours=" + scours + ", saddr=" + saddr + ", cobj=" + cobj + "]";
	}
	
}