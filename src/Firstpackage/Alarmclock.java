package Firstpackage;

public class Alarmclock {
String brandName;

String powerSource;

boolean isDigital;

void setAlarm() {
	System.out.println("set alarm using " + brandName + " alarm");
}
void displayTime() {
	System.out.println("Display time if alarm is digital. Alarm digital:" + isDigital);
}

}
