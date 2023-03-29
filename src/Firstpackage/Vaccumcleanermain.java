package Firstpackage;

public class Vaccumcleanermain {

	public static void main(String[] args) {
		Vaccumcleaner Dyson = new Vaccumcleaner();
		Dyson.brandName = "Dyson";
		Dyson.powerSource = "Battery";
		Dyson.capacity = 1;
		Dyson.wattage = 400;
		Dyson.isitCordless = true;
		Dyson.cleanSofa();
		Dyson.cleanCarpet();
		
		
		

	}

}
