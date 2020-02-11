package com.app.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
@Id
@Column(name="uid")
	private int uid;
@Column(name="uname")
	private String uname;
@Column(name="ucode")
	private String ucode;
	public User() {
		super();
	}
	
	public User(int uid, String uname, String ucode) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.ucode = ucode;
	}

	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUcode() {
		return ucode;
	}
	public void setUcode(String ucode) {
		this.ucode = ucode;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", ucode=" + ucode + "]";
	}
		

}
