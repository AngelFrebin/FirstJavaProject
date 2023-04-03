package assignmentApril03;
import java.util.Scanner;

public class Calculator {
double num1;
double num2;



Scanner sc = new Scanner(System.in);

void sumOfNumbers() {
	System.out.println("Enter num1");
	num1 = sc.nextDouble();
	System.out.println("Enter num2");
	num2 = sc.nextDouble();
	double sum = num1 + num2;
	System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
}

void differenceOfNumbers() {
	System.out.println("Enter num1");
	num1 = sc.nextDouble();
	System.out.println("Enter num2");
	num2 = sc.nextDouble();
	double difference = num1 - num2;
	System.out.println("Difference of " + num1 + " and " + num2 + " is " + difference);
}

void productOFNumbers() {
	System.out.println("Enter num1");
	num1 = sc.nextDouble();
	System.out.println("Enter num2");
	num2 = sc.nextDouble();
	double product = num1 * num2;
	System.out.println("Product of " + num1 + " and " + num2 + " is " + product);
}

void divisionOfNumbers() {
	System.out.println("Enter num1");
	num1 = sc.nextDouble();
	System.out.println("Enter num2");
	num2 = sc.nextDouble();
	double quotient = num1 / num2;
	System.out.println("Quotient of " + num1 + " and " + num2 + " is " + quotient);
	double remainder = num1 % num2;
	System.out.println("Remainder of the division operation of " + num1 + " and " + num2 + " is " + remainder);
}

void squareOfNumbers() {
	System.out.println("Enter num1");
	num1 = sc.nextDouble();
	double square = num1*num1;
	System.out.println("Square of " + num1 + " is " + square);
}

void cubeOfNumbers()  {
	System.out.println("Enter num1");
	num1 = sc.nextDouble();
	double cube = num1*num1*num1;
	System.out.println("Cube of " + num1 + " is " + cube);
}
void invalidOperation() {
	System.out.println("invalid operation");
}

}



