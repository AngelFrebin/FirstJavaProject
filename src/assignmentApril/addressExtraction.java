package assignmentApril;

public class addressExtraction {
	String str = "100 queen street,Toronto,M5V 3E3 ";
	String [] addressparts = str.split(",");
	String streetAddress = addressparts[0];
	String city = addressparts[1];
	String zip = addressparts[2];
void address(){
	System.out.println("Street address : " + streetAddress);
	System.out.println("City: " + city);
	System.out.println("Zip code: " + zip);
	
}
}
