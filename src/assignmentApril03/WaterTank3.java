package assignmentApril03;
import java.util.Scanner;

public class WaterTank3 {
	int capacityOfWaterTank = 100;
	int capacityOfBucket    = 10;
	int waterFilledInWaterTank;
	int counter;
	Scanner input = new Scanner(System.in);
	
	
	void fillingWaterTank() {
		for(int counter=1;counter<=10;counter++) {
			System.out.println("Type the number of time the tank has to be filled");
			 counter = input.nextInt();
			waterFilledInWaterTank = counter*10;
			
			if (counter<10) {
				int numberNeedsToFillTheTank;
				System.out.println("water getting filled in to watertank is " + waterFilledInWaterTank +" liters");
				numberNeedsToFillTheTank = 10- counter;
				System.out.println("fill " + numberNeedsToFillTheTank + " times more for the tank to be filled");
				System.out.println("Type the remaining number needed to fill the tank");
				counter = input.nextInt();
				if(numberNeedsToFillTheTank!=counter) {
					System.out.println("invalid response");
					break;}
					else {
						System.out.println("water tank capacity reached, stop filling to prevent overflow. water in watertank is 100 liters");
						break;}
					}
				
			else {
				if(counter==10){
					System.out.println("water tank capacity reached, stop filling to prevent overflow. water in watertank is " + waterFilledInWaterTank +" liters" );
					break;}
				else {
					System.out.println("invalid response. Maximum limit is from 1-10");
					}
				
			}
				
			
			
		}
	}

}
