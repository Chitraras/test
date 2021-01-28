package com.css.corejava;

import java.util.Arrays;

public class Batch {
	private String batchCode;
	private String startDate;
	private String endDate;
	private Trainee[] trainees;
	@Override
	public String toString() {
		return "Batch [batchCode=" + batchCode + ", startDate=" + startDate + ", endDate=" + endDate + ", trainees="
				+ Arrays.toString(trainees) + "]";
	}
	public Batch(String batchCode, String startDate, String endDate, Trainee[] trainees) {
		super();
		this.batchCode = batchCode;
		this.startDate = startDate;
		this.endDate = endDate;
		this.trainees = trainees;
	}
	public Batch() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getBatchCode() {
		return batchCode;
	}
	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public Trainee[] getTrainees() {
		return trainees;
	}
	public void setTrainees(Trainee[] trainees) {
		this.trainees = trainees;
	}
	
	public Trainee[] getTrainees(String gender) {
		Trainee[] foundTrainees=new Trainee[0];
		int i=0;
		for (Trainee trainee:trainees) {
			String gen=trainee.getGender();
			if(gen.equals(gender)) {
				foundTrainees[i]=trainee;
				i++;
			}
		}
		return foundTrainees;
			
	}
	public Trainee[] getTrainees(int age) {
		Trainee[] foundTrainees=new Trainee[0];
		int i=0;
		for (Trainee trainee:trainees) {
			int ag=trainee.getAge();
			if(ag==(age)) {
				foundTrainees[i]=trainee;
				i++;
			}
		}
		return foundTrainees;
		
		}
		
	
	
}
