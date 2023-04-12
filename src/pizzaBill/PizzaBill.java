package pizzaBill;

import java.util.Scanner;

public class PizzaBill {
	String pizzaSize;
	boolean isPepperoniToppingNeeded;
	boolean isExtraCheeseNeeded;
	int bill;
	Scanner input = new Scanner(System.in);

	void pizzaBill() {
		System.out.println("Enter the size of pizza");
		String pizzaSize = input.nextLine();
		if (pizzaSize.equals("small")) {
			bill = 15;
			System.out.println("Extra Pepperonni topping needed: true / false");
			isPepperoniToppingNeeded = input.nextBoolean();
			if (isPepperoniToppingNeeded == true) {
				bill = 15 + 2;
				System.out.println("Your current Bill is " + bill);
			} else {
				System.out.println("Your Final Bill is " + bill);
			}
			System.out.println("Extra cheese topping needed: true / false");
			isExtraCheeseNeeded = input.nextBoolean();
			if (isExtraCheeseNeeded == true) {
				bill = bill + 1;
				System.out.println("Your final Bill is " + bill);
			} else {
				System.out.println("Your Final Bill is " + bill);
			}

		} else if (pizzaSize.equals("medium")) {
			bill = 20;
			System.out.println("Extra Pepperonni topping needed: true / false");
			isPepperoniToppingNeeded = input.nextBoolean();
			if (isPepperoniToppingNeeded == true) {
				bill = 20 + 3;
				System.out.println("Your current Bill is " + bill);
			} else {
				System.out.println("Your Final Bill is " + bill);
			}
			System.out.println("Extra cheese topping needed: true / false");
			isExtraCheeseNeeded = input.nextBoolean();
			if (isExtraCheeseNeeded == true) {
				bill = bill + 1;
				System.out.println("Your final Bill is " + bill);
			} else {
				System.out.println("Your Final Bill is " + bill);
			}

		} else if (pizzaSize.equals("large")) {
			bill = 25;
			System.out.println("Extra Pepperonni topping needed: true / false");
			isPepperoniToppingNeeded = input.nextBoolean();
			if (isPepperoniToppingNeeded == true) {
				bill = 25 + 3;
				System.out.println("Your current Bill is " + bill);
			} else {
				System.out.println("Your Final Bill is " + bill);
			}
			System.out.println("Extra cheese topping needed: true / false");
			isExtraCheeseNeeded = input.nextBoolean();
			if (isExtraCheeseNeeded == true) {
				bill = bill + 1;
				System.out.println("Your Final Bill is " + bill);
			} else {
				System.out.println("Your Final Bill is " + bill);
			}

		} else {
			System.out.println("Enter a valid pizza size");
		}
	}
}
