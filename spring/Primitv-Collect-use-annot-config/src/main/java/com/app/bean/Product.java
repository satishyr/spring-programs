package com.app.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pobj")
public class Product {
@Value("100")
	private int pid;
@Value("soap")
	private String pname;
@Value("30.50")
    private double pcost;
@Value("#{lstobj}")
	private List<String> pcodes;
@Value("#{mapobj}")
	private Map<Integer,String> pprjs;
@Value("#{propobj}")
	private Properties props;
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
	public double getPcost() {
		return pcost;
	}
	public void setPcost(double pcost) {
		this.pcost = pcost;
	}
	public List<String> getPcodes() {
		return pcodes;
	}
	public void setPcodes(List<String> pcodes) {
		this.pcodes = pcodes;
	}
	public Map<Integer, String> getPprjs() {
		return pprjs;
	}
	public void setPprjs(Map<Integer, String> pprjs) {
		this.pprjs = pprjs;
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pcost=" + pcost + ", pcodes=" + pcodes + ", pprjs="
				+ pprjs + ", props=" + props + "]";
	}
	
}
