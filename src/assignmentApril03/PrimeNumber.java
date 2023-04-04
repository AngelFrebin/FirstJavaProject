package assignmentApril03;

import java.util.Scanner;

public class PrimeNumber {
	int number;
	Scanner input = new Scanner(System.in);

	void primeNum() {
		System.out.println("Enter a positive integer");
		number = input.nextInt();
		boolean isPrime = true;
		if (number <= 1) {
			isPrime = false;
		} else if (number == 2) {
			isPrime = true;
		} else {
			int i = 2;
			while (i < number) {
				if (number % i == 0) {
					isPrime = false;
				}
				i++;
			}
			if (isPrime) {
				System.out.println(number + " is a prime number");
			} else {
				System.out.println(number + " is not a prime number");
			}

		}

	}
}
