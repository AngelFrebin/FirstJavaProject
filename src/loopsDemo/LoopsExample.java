package loopsDemo;

public class LoopsExample {

	int number;
	int finalNumber;
	int result;
	
	void printMultiples() {
		while(number<=10) {
			result = number*2;
			System.out.println(result);
			number++;
			
		}
	}
}
