package assignmentApril03;
import java.util.Scanner;
public class WaterTank2 {
	int maxCapacityTank     =  100;
	int currentWaterInTank = 0;
	int bucketCapacity = 10;
	int counter;
	Scanner input = new Scanner(System.in);
	
	void fillingTank() {
		System.out.println("Enter times to be filled with bucket");
		counter = input.nextInt();
		currentWaterInTank = counter*10;
		if(currentWaterInTank<=maxCapacityTank) {
			System.out.println("water filled in the tank is " + currentWaterInTank + " liters");
		}
		else {
			System.out.println("Maximum capacity exceeded");
		}
		
	}

}
