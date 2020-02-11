package com.app;

public class ModelImpl implements IModel {
	private int mid;
	private String mname;
	public ModelImpl() {
		super();
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	@Override
	public String toString() {
		return "ModelImpl [mid=" + mid + ", mname=" + mname + "]";
	}
	


}
