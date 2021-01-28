
public class Car {
	private String brand;
	private String model;
	private String color;
	private int speedKMPH;
	private int noOfSeat;
	//constructor
	
	public Car(String brand, String model, String color, int speedKMPH, int noOfSeat) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.speedKMPH = speedKMPH;
		this.noOfSeat = noOfSeat;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeedKMPH() {
		return speedKMPH;
	}
	public void setSpeedKMPH(int speedKMPH) {
		this.speedKMPH = speedKMPH;
	}
	public int getNoOfSeat() {
		return noOfSeat;
	}
	public void setNoOfSeat(int noOfSeat) {
		this.noOfSeat = noOfSeat;
	}
	
	

}
