package Firstpackage;

public class Alarmclockmain {

	public static void main(String[] args) {
		Alarmclock Sony = new Alarmclock();
		Sony.brandName = "Sony";
		Sony.powerSource = "Battery";
		Sony.isDigital = true;
		Sony.displayTime();
		Sony.setAlarm();

	}

}
