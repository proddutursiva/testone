package com.studentmarks;

import org.springframework.beans.factory.annotation.Autowired;

public class detailsBean {
	private String fname;
	private String nplace;
	private studentBean add;
	public detailsBean() {
		
	}
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getNplace() {
		return nplace;
	}

	public void setNplace(String nplace) {
		this.nplace = nplace;
	}

	public studentBean getAdd() {
		return add;
	}

	public void setAdd(studentBean add) {
		this.add = add;
	}

	public  void printl()
	{
		System.out.println("fname="+fname);
		System.out.println("nplace="+nplace);
	}
	
	

}
