
public class XYZ {
	
	public static void main(String[] args) {
		
		Bicycle b1=new Bicycle("BMX","Blue");
		//Print Bicycle retail Value
		System.out.println("Bicycle Value is  :"+b1.getSalePrice(12000));
		
		Tricycle t1 = new Tricycle("ABC","Purple",2016,1500);
		System.out.println("Tricycle Value is  :"+t1.getSalePrice(7500));
	}

}
