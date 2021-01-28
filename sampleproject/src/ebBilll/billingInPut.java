package ebBilll;

public class billingInPut {
	private double oldreading;
	private double newreading;
	@Override
	public String toString() {
		return "billingInPut [oldreading=" + oldreading + ", newreading=" + newreading + "]";
	}
	public billingInPut(double oldreading, double newreading) {
		super();
		this.oldreading = oldreading;
		this.newreading = newreading;
	}
	public billingInPut() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double getOldreading() {
		return oldreading;
	}
	public void setOldreading(double oldreading) {
		this.oldreading = oldreading;
	}
	public double getNewreading() {
		return newreading;
	}
	public void setNewreading(double newreading) {
		this.newreading = newreading;
	}
	public void   usedreading(int oldre ,int newre) {
		
	}
}
