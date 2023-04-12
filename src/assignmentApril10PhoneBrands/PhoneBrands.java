package assignmentApril10PhoneBrands;

import java.util.Scanner;

public class PhoneBrands {
	String[] samsung = { "s20", "s21", "flip3", "fold3" };
	String[] google = { "google pixel 6", "google pixel 6 pro", "google pixel pro", "google pixel 5" };
	String[] iphone = { "iphone 12", "iphone 12 mini", "iphone 11", "iphone 11 pro" };
	Scanner sc = new Scanner(System.in);

	void findPhoneBrand() {
		System.out.println("Enter the brand name");
		String brandName = sc.next();
		if (brandName.equals("samsung")) {
			System.out.println("Available Products in " + brandName + " mobile are:");
			for (int i = 0; i < samsung.length; i++) {
				System.out.println(samsung[i]);
			}

		} else if (brandName.equals("google")) {
			System.out.println("Available Products in " + brandName + " mobile are:");
			for (int i = 0; i < google.length; i++) {
				System.out.println(google[i]);
			}

		} else if (brandName.equals("iphone")) {
			System.out.println("Available Products in " + brandName + " mobile are:");
			for (int i = 0; i < iphone.length; i++) {
				System.out.println(iphone[i]);
			}

		} else {
			System.out.println("This brand is not available");
		}
		System.out.println("Enter the product name");
		String productName = sc.nextLine();
		if(brandName.equals("samsung")) {
		for (int i = 0; i < samsung.length; i++) {
			if (samsung[i].equals(productName)) {
				System.out.println("product selected is : " + productName + " of " + brandName + " brand");
			}

		}}
		else if(brandName.equals("google")) {
		for (int i = 0; i < google.length; i++) {
			if (google[i].equals(productName)) {
				System.out.println("product selected is : " + productName + " of " + brandName + " brand");
			}
		}}
		else if(brandName.equals("iphone")) {
		for (int i = 0; i < iphone.length; i++) {
			if (iphone[i].equals(productName)) {
				System.out.println("product selected is : " + productName + " of " + brandName + " brand");

			}
		}}
		else {
			System.out.println("Please select a product from the list");
		}
	}
}
