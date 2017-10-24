package Flyweight.Update;

public abstract class Flyweight {
	private String intrinsic;
	protected final String Extrinsic;
	public Flyweight(String extrinsic) {
		super();
		Extrinsic = extrinsic;
	}
	
	public abstract void operate();

	public String getIntrinsic() {
		return intrinsic;
	}

	public void setIntrinsic(String intrinsic) {
		this.intrinsic = intrinsic;
	}
}
