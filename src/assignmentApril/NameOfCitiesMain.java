package assignmentApril;
import java.util.Scanner;
public class NameOfCitiesMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter city to check");
		String nameOfCity = input.nextLine();
		NameOfCities cityName = new NameOfCities();
		cityName.findNameOfCities(nameOfCity);
        cityName.findCitiesEndsWithTon();
        cityName.replaceEndingWithFun();
	}

}
