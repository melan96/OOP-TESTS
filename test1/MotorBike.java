
public class MotorBike extends Bicycle {
	
	
	private int engineCapacity;

	public MotorBike(String brand, float regularPrice, String colour,int engineCapacity) {
		super(brand, colour);
		this.engineCapacity=engineCapacity;
		// TODO Auto-generated constructor stub
	}

	@Override
	public float getSalePrice(float regularPrice) {
		
		this.regularPrice=regularPrice;
		if(this.engineCapacity > 1500) {
			return this.regularPrice-this.regularPrice*15/100;
			
		}
		else {
			return this.regularPrice;
		}
	}
	
	

}
