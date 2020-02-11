package com.app.model;

import java.util.List;
import java.util.Set;

public class Product {
private int pid;
private String pname;
private List<String> pdata;
private Set<Integer> pcost;
public Product() {
	super();
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public List<String> getPdata() {
	return pdata;
}
public void setPdata(List<String> pdata) {
	this.pdata = pdata;
}
public Set<Integer> getPcost() {
	return pcost;
}
public void setPcost(Set<Integer> pcost) {
	this.pcost = pcost;
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + ", pdata=" + pdata + ", pcost=" + pcost + "]";
}

}
