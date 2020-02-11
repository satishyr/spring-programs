package com.app.bean;

import java.util.List;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;

public class Course {

private int cid;
private List<String> cnames;
private Properties ccost;
public Course() {
	super();
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public List<String> getCnames() {
	return cnames;
}
public void setCnames(List<String> cnames) {
	this.cnames = cnames;
}
public Properties getCcost() {
	return ccost;
}
public void setCcost(Properties ccost) {
	this.ccost = ccost;
}
@Override
public String toString() {
	return "Course [cid=" + cid + ", cnames=" + cnames + ", ccost=" + ccost + "]";
}

}
