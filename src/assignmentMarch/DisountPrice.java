package assignmentMarch;

public class DisountPrice {
  
	double currentPrice; 
	String promoApplied; 
	double discountPrice;
	
	void discountPrice() {
		currentPrice *= 0.5; //After 50% discount applied
		if(promoApplied == "promo5") {
			discountPrice = currentPrice*=0.05; //After 5% discount applied
			System.out.println("The discounted price is " + discountPrice);
      }
		else if(promoApplied == "promo10") {
			discountPrice = currentPrice*=0.1; //After 10% discount applied
			System.out.println("The discounted price is " + discountPrice);
		}
		else if(promoApplied == "promo20") {
			discountPrice = currentPrice*=0.2; //After 20% discount applied
			System.out.println("The discounted price is " + discountPrice);
		}
		else {
			System.out.println("No additional discount, price is " + currentPrice);
		}
	}
}
