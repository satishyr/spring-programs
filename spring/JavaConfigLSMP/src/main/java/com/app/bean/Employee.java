package com.app.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {

	private int eid;
	private String ename;
	private Set<String> eprjs;
	private List<String> edepts;
	private Map<Integer,String>evers;
	private Properties empModes;
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
	public Set<String> getEprjs() {
		return eprjs;
	}
	public void setEprjs(Set<String> eprjs) {
		this.eprjs = eprjs;
	}
	public List<String> getEdepts() {
		return edepts;
	}
	public void setEdepts(List<String> edepts) {
		this.edepts = edepts;
	}
	public Map<Integer, String> getEvers() {
		return evers;
	}
	public void setEvers(Map<Integer, String> evers) {
		this.evers = evers;
	}
	public Properties getEmpModes() {
		return empModes;
	}
	public void setEmpModes(Properties empModes) {
		this.empModes = empModes;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eprjs=" + eprjs + ", edepts=" + edepts + ", evers="
				+ evers + ", empModes=" + empModes + "]";
	}
	
}
