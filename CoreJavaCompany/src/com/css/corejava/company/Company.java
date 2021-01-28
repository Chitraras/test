package com.css.corejava.company;

public class Company {
	private int companyID;
	private Address address;
	private EmployeeMap<Integer,String>employees =new Employee();
	public int getCompanyID() {
		return companyID;
	}
	public void setCompanyID(int companyID) {
		this.companyID = companyID;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public EmployeeMap<Integer, String> getEmployees() {
		return employees;
	}
	public void setEmployees(EmployeeMap<Integer, String> employees) {
		this.employees = employees;
	}
	public Company(int companyID, Address address, EmployeeMap<Integer, String> employees) {
		super();
		this.companyID = companyID;
		this.address = address;
		this.employees = employees;
	}
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Company [companyID=" + companyID + ", address=" + address + ", employees=" + employees + "]";
	}
	
	
	

	

}
