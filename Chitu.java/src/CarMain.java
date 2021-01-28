
public class CarMain {
	public static void main(String[] args) {
		Car myCar=new Car( "Mastang","MS420" ,"Mid-Black", 145, 4);
		System.out.println(myCar.getBrand());
		System.out.println(myCar.getModel());
		System.out.println(myCar.getColor());
		System.out.println(myCar.getSpeedKMPH());
		System.out.println(myCar.getNoOfSeat());
	}

}
