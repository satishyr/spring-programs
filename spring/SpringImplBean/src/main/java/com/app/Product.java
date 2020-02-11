package com.app;

public class Product {
	private int pid;
	private IModel m;
	public Product() {
		super();
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public IModel getM() {
		return m;
	}
	public void setM(IModel m) {
		this.m = m;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", m=" + m + "]";
	}
	
	

}
