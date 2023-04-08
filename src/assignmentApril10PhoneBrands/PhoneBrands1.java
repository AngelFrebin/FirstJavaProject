package assignmentApril10PhoneBrands;
import java.util.Scanner;

public class PhoneBrands1 {String[] samsung = { "s20", "s21", "flip3", "fold3" };
String[] google = { "googlepixel6", "googlepixel6pro", "googlepixelpro", "googlepixel5" };
String[] iphone = { "iphone12", "iphone12mini", "iphone11", "iphone11Pro" };

void findPhoneBrand() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the brand name");
	String brandName = sc.next();
	if (brandName.equals("samsung")) {
		System.out.println("Available Products in " + brandName + " mobile are:");
		for (int i = 0; i < samsung.length; i++) {
			System.out.println(samsung[i]);
		}
		System.out.println("Enter the product name");
		String productName = sc.next();
		for (int i = 0; i < samsung.length; i++) {
			if (samsung[i].equals(productName)) {
				System.out.println("product selected is : " + productName + " of " + brandName + " brand");
				
			} 
		}
	} else if (brandName.equals("google")) {
		System.out.println("Available Products in " + brandName + " mobile are:");
		for (int i = 0; i < google.length; i++) {
			System.out.println(google[i]);
		}
		System.out.println("Enter the product name");
		String productName = sc.next();
		for (int i = 0; i < google.length; i++) {
			if (google[i].equals(productName)) {
				System.out.println("product selected is : " + productName + " of " + brandName + " brand");
			} 
		}
	} else if (brandName.equals("iphone")) {
		System.out.println("Available Products in " + brandName + " mobile are:");
		for (int i = 0; i < iphone.length; i++) {
			System.out.println(iphone[i]);
		}
		System.out.println("Enter the product name");
		String productName = sc.next();
		for (int i = 0; i < iphone.length; i++) {
			if (iphone[i].equals(productName)) {
				System.out.println("product selected is : " + productName + " of " + brandName + " brand");
			} 
		}
	} else {
		System.out.println("This brand is not available");
	}

}
}




