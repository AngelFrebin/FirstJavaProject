package arrayExample;

public class ArrayExample {
 int [] arrayExample = new int[10];
 int number;
 
 void divisibleBy() {
 int count=0;
	for(int i=0;count<arrayExample.length;i++) {
		if(i%3==0 && i%5==0) {
			arrayExample[count]=i;
			count++;		
		}}
		System.out.println("The first 10 numbers divisible by 3 & 5 are:");
		for(int i=0; i<arrayExample.length;i++) {
			System.out.println(arrayExample[i]);
		
		
			
		}
		

	 
 

}}