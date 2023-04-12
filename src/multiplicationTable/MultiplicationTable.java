package multiplicationTable;

import java.util.Scanner;

public class MultiplicationTable {
	float number;
	int counter;
	float result;
	Scanner input = new Scanner(System.in);
	void multiplicationTable() {
		System.out.println("enter which multiplication table should be displayed");
		number = input.nextFloat();
		System.out.println("enter till which number the table should be displayed");
		counter = input.nextInt();
		for(int i = 0;
				i<=counter;
				i++) {
		result = number*i;
		System.out.println(number + " * " + i + " = " + result);
			
		}
	}
}
