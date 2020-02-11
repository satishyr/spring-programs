package com.app.model;

import java.util.Properties;

public class Stdcodes {
	private Properties mysrms;
	private Properties mycodes;
	public Stdcodes() {
		super();
	}
	public Properties getMysrms() {
		return mysrms;
	}
	public void setMysrms(Properties mysrms) {
		this.mysrms = mysrms;
	}
	public Properties getMycodes() {
		return mycodes;
	}
	public void setMycodes(Properties mycodes) {
		this.mycodes = mycodes;
	}
	@Override
	public String toString() {
		return "Stdcodes [mysrms=" + mysrms + ", mycodes=" + mycodes + "]";
	}

}
