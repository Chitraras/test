package com.css.corejava;

public class Trainee {
	
	private int traineeID;
	private String traineeName;
	private int contactNUM;
	private String emailID;
	private String gender;
	private int age;
	@Override
	public String toString() {
		return "Trainee [traineeID=" + traineeID + ", traineeName=" + traineeName + ", contactNUM=" + contactNUM
				+ ", emailID=" + emailID + ", gender=" + gender + ", age=" + age + "]";
	}
	public Trainee(int traineeID, String traineeName, int contactNUM, String emailID, String gender, int age) {
		super();
		this.traineeID = traineeID;
		this.traineeName = traineeName;
		this.contactNUM = contactNUM;
		this.emailID = emailID;
		this.gender = gender;
		this.age = age;
	}
	public Trainee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getTraineeID() {
		return traineeID;
	}
	public void setTraineeID(int traineeID) {
		this.traineeID = traineeID;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public int getContactNUM() {
		return contactNUM;
	}
	public void setContactNUM(int contactNUM) {
		this.contactNUM = contactNUM;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
