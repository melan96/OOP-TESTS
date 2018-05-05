public class Bicycle {

	public String brand;
	public float regularPrice;
	public String colour;
	
	public Bicycle(String brand,String colour) {
		this.brand=brand;
		this.colour=colour;
	}
	
	public float getSalePrice(float regularPrice) {
		this.regularPrice = regularPrice;
		return this.regularPrice;
	}
	

}
