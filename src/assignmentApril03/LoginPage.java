package assignmentApril03;
import java.util.Scanner;

public class LoginPage {
	String actualUserId   ="pivotAdmin";
	String actualPassword ="Admin123";
	String enteredUserId;
	String enteredPassword;
	Scanner input = new Scanner(System.in);
	void checkLogin() {
		for(int counter =1;
				counter<=4;
				counter++) {
			System.out.println("Enter userId");
			enteredUserId = input.next();
			System.out.println("Enter password");
			enteredPassword = input.next();
			if(enteredUserId.equals(actualUserId) && enteredPassword.equals(actualPassword)) {
				System.out.println("You are logged in to the application");
				break;
					}
			else if(counter<=3 && enteredUserId.equals(actualUserId) && enteredPassword.equalsIgnoreCase(actualPassword)) {
				System.out.println("Entered password is incorrect try again");
			}
			else if(counter<=3 && enteredUserId.equalsIgnoreCase(actualUserId) && enteredPassword.equals(actualPassword)) {
				System.out.println("Entered userId is incorrect try again");	
			}
			else if (counter<=3 && enteredUserId.equalsIgnoreCase(actualUserId) && enteredPassword.equalsIgnoreCase(actualPassword)) {
				System.out.println("Incorrect userId and Password");
			}
			else {
				if(counter==4 && enteredUserId.equals(actualUserId) && enteredPassword.equals(actualPassword)){
					System.out.println("You are logged in to the application");	
	        }
				else {
					System.out.println("Account locked");	
				}
				
			}
				
}}}