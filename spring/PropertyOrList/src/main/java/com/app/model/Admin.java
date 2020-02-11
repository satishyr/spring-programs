package com.app.model;

import java.util.List;
import java.util.Map;

public class Admin {
	private int adminid;
	private List<String> admindepts;
	private Map<String,String> adminprjs;
	@Override
	public String toString() {
		return "Admin [adminid=" + adminid + ", admindepts=" + admindepts + ", adminprjs=" + adminprjs + "]";
	}
	public int getAdminid() {
		return adminid;
	}
	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}
	public List<String> getAdmindepts() {
		return admindepts;
	}
	public void setAdmindepts(List<String> admindepts) {
		this.admindepts = admindepts;
	}
	public Map<String, String> getAdminprjs() {
		return adminprjs;
	}
	public void setAdminprjs(Map<String, String> adminprjs) {
		this.adminprjs = adminprjs;
	}
	public Admin() {
		super();
	}

}
