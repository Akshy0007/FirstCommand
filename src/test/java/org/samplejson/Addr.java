package org.samplejson;

public class Addr {
	
	private int pincode;
	private int phnum;
	private boolean Status;
	private String designation;
	
	public int getPincode() {
		return pincode;
	}
	public int getPhnum() {
		return phnum;
	}
	public boolean isStatus() {
		return Status;
	}
	public String getDesignation() {
		return designation;
	}
	public Addr(int pincode, int phnum, boolean status, String designation) {
		this.pincode = pincode;
		this.phnum = phnum;
		Status = status;
		this.designation = designation;
	}
	public Addr(long l) {
		// TODO Auto-generated constructor stub
	}
	public Addr(String string) {
		// TODO Auto-generated constructor stub
	}
	public Addr(int l) {
		// TODO Auto-generated constructor stub
	}
	
	

}
