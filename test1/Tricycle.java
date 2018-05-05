
public class Tricycle extends Bicycle {

	public int year;
	public float taxDiscount;
	
	public Tricycle(String brand, String colour, int year, float taxDiscount) {
		super(brand,colour);
		this.year = year;
		this.taxDiscount = taxDiscount;
	}

	
	

	@Override
	public float getSalePrice(float regularPrice) {
		this.regularPrice=regularPrice;
		return this.regularPrice-this.taxDiscount;
	}
	
	
	
}
