package com.app.bean;

import java.util.Properties;
import java.util.Set;

public class Address {
	private int addrid;
	private Properties cords;
	private Set<String> data;
	public Address() {
		super();
	}
	@Override
	public String toString() {
		return "Address [addrid=" + addrid + ", cords=" + cords + ", data=" + data + "]";
	}
	public int getAddrid() {
		return addrid;
	}
	public void setAddrid(int addrid) {
		this.addrid = addrid;
	}
	public Properties getCords() {
		return cords;
	}
	public void setCords(Properties cords) {
		this.cords = cords;
	}
	public Set<String> getData() {
		return data;
	}
	public void setData(Set<String> data) {
		this.data = data;
	}
	

}
