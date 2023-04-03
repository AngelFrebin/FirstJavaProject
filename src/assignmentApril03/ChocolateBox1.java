package assignmentApril03;
import java.util.Scanner;
public class ChocolateBox1 {
	int maxChocolates = 63;
	int currentChocolates = 27;
	int setNumber;
	
	Scanner input = new Scanner(System.in);
	void chocolateBox(){
		    System.out.println("Adding 5 chocolates to the box");
			System.out.println("Type the set number to add");
			setNumber = input.nextInt();
			currentChocolates = 27+setNumber*5;
		if(currentChocolates<=maxChocolates) {
			System.out.println("chocolates in the box is " + currentChocolates );
		}
		else {
			System.out.println("Maximum capacity exceeded");
		}
	}
	
			

}
