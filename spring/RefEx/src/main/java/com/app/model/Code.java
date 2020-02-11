package com.app.model;

public class Code {
private int cid;
private Side sd;
public Code() {
	super();
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public Side getSd() {
	return sd;
}
public void setSd(Side sd) {
	this.sd = sd;
}
@Override
public String toString() {
	return "Code [cid=" + cid + ", sd=" + sd + "]";
}

}
