package assignmentApril03;
import java.util.Scanner;
public class ChocolateBox2 {
int actualChocolates =27;
int currentChocolates;
Scanner input = new Scanner(System.in);
void addingChocolates() {
	
	for(int counter=1;counter<=8;counter++) {
		currentChocolates = actualChocolates + counter*5;
		if(counter<7) {
			System.out.println("keep adding 5 chocolates to box");
		}
		else if(counter== 7){
			System.out.println("Chocolates in the box is " + currentChocolates);
		}
		else {
		System.out.println("can't add more chocolates, count will go above 63");	
		
		
	}
}
	
}}
