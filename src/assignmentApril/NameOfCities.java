package assignmentApril;

public class NameOfCities {

	String [] nameOfCities = {"Toronto", "Ottawa", "Brampton", "Hamilton", "London", "Mississauga", "Burlington","Kingston","Kitchener"};
	
	void findNameOfCities(String cityName) {
		boolean doesCityFound = false;
		for(int i=0;i<nameOfCities.length;i++) {
			if(nameOfCities[i].equals(cityName)){	
				doesCityFound = true;
			}
		}
		if(doesCityFound) {
			System.out.println(cityName + " found in the list ");
		}
		else{
			System.out.println(cityName + " not found in the list");	
		}
		
	}
	void findCitiesEndsWithTon() {
		for(int i=0;i<nameOfCities.length;i++) {
			if(nameOfCities[i].endsWith("ton")) {	
				System.out.println(nameOfCities[i] + " ends with ton in this list");
			}
		}
	}
	void replaceEndingWithFun() {
		for(int i=0;i<nameOfCities.length;i++) {
			if(nameOfCities[i].endsWith("ton")) {	
				String newName = nameOfCities[i].replace("ton", "fun");
				System.out.println(nameOfCities[i] + " modified to " + newName);
			}
		}
	}
}
