package Firstpackage;

public class Airfryer {
	String brandName;
	
	int capacity;
	
	String material;
	
	
	boolean isDishwashersafe;
	
	void roast() {
		System.out.println("Roast chicken with " + brandName + "Airfryer" );
	}
	void cleanAirfryer() {
		System.out.println("Airfryer can be washed in dishwasher if dishwasher safe.Dishwasher safe:" + isDishwashersafe);
	}
	
}
