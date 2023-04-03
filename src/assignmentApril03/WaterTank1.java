package assignmentApril03;

public class WaterTank1 {
	int capacityOfWaterTank = 100;
	int capacityOfBucket    = 10;
	int waterFilledInWaterTank;
	void fillingWaterTankUsingBucket() {
		for(int counter=1;
				counter<=10;
				counter++) {
			waterFilledInWaterTank = counter*10;
			if (counter<10) {
				System.out.println("water getting filled in to watertank is " + waterFilledInWaterTank +" liters");		
			}
			else {
				System.out.println("water tank capacity reached, stop filling to prevent overflow. water in watertank is " + waterFilledInWaterTank + " liters" );
			}

		}
	}

}
