package corejava;

public class Batch {
	private int batchCode;
	private  startDate startDate;
	private endDate endDate;
	private trainee trainee;
	public int getBatchCode() {
		return batchCode;
	}
	public void setBatchCode(int batchCode) {
		this.batchCode = batchCode;
	}
	public startDate getStartDate() {
		return startDate;
	}
	public void setStartDate(startDate startDate) {
		this.startDate = startDate;
	}
	public endDate getEndDate() {
		return endDate;
	}
	public void setEndDate(endDate endDate) {
		this.endDate = endDate;
	}
	public trainee getTrainee() {
		return trainee;
	}
	public void setTrainee(trainee trainee) {
		this.trainee = trainee;
	}
	public Batch(int batchCode, corejava.startDate startDate, corejava.endDate endDate, corejava.trainee trainee) {
		super();
		this.batchCode = batchCode;
		this.startDate = startDate;
		this.endDate = endDate;
		this.trainee = trainee;
	}
	public Batch() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
