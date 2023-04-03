package assignmentApril03;
import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner oper = new Scanner(System.in);
		System.out.println("Type the operation to perform");
		String operation = oper.next();
		
			switch (operation) {
			case "add":
				calculator.sumOfNumbers();
				break;
			case "subtract":
				calculator.differenceOfNumbers();
				break;
			case "multiply":
				calculator.productOFNumbers();
				break;
			case "divide":
				calculator.divisionOfNumbers();
				break;
			case "square" :
				calculator.squareOfNumbers();
				break;
			case "cube" :
				calculator.cubeOfNumbers();
				break;
			default :
				calculator.invalidOperation();
	oper.close();			

}
	}}
