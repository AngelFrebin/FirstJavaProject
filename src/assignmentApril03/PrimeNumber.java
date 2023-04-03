package assignmentApril03;
import java.util.Scanner;

public class PrimeNumber {
	int number;
	Scanner input = new Scanner(System.in);
	void primeNum() {
	System.out.println("Enter a positive integer");
	number = input.nextInt();
	if(number<=2) {
		if(number<2) {
		System.out.println(number + "is not prime number");
	    }
		else {
		System.out.println(number + " is a prime number");
		}
		}
	else {
			if(number%2 != 0) {
			System.out.println(number + " is a prime number");
			}
		else {
			System.out.println(number + " is not a prime number");
		}
		
		}
			
		
		
		}}
	


