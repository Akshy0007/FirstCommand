package org.samplejson;

import java.util.List;

public class comapny {
	private String Name;
	private String country;
	private int empid;
	private double salary;
	private Comp comapny;
	private List<Addr> addr;

	public String getName() {
		return Name;
	}
	public String getCountry() {
		return country;
	}
	public int getEmpid() {
		return empid;
	}
	public double getSalary() {
		return salary;
	}
	public comapny(String name, String country, int empid, double salary) {
		Name = name;
		this.country = country;
		this.empid = empid;
		this.salary = salary;
	}
	
	
	

}
