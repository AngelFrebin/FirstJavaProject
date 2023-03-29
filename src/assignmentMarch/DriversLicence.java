package assignmentMarch;

public class DriversLicence {
	int age;
	String currentLevel;
	void licenceApproval() {
		if (age >=16 && currentLevel == "null") {
			System.out.println("G1 Licence issued");
		}
		else if (age>=17 && currentLevel == "G1") {
			System.out.println("G2 Licence issued");
		}
		else if (age>=17 && currentLevel == "G2") {
			System.out.println("G Licence issued");
		}
		else if (age>=17 && currentLevel == "G") {
			System.out.println("Already have G licence");
		}
		else {
			System.out.println("Licence is not issued");
		}
	}

}
