package corejava;

public class trainee {
	private int traineeId;
	private String trineeName;
	private contactNo contactNo;
	private String email;
	private String gender;
	private int age;
	public trainee(int traineeId, String trineeName, corejava.contactNo contactNo, String email, String gender,
			int age) {
		super();
		this.traineeId = traineeId;
		this.trineeName = trineeName;
		this.contactNo = contactNo;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}
	public trainee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}
	public String getTrineeName() {
		return trineeName;
	}
	public void setTrineeName(String trineeName) {
		this.trineeName = trineeName;
	}
	public contactNo getContactNo() {
		return contactNo;
	}
	public void setContactNo(contactNo contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
