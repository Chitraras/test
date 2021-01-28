package ebBilll;

import java.util.Scanner;

public class userInput {
	public static void main(String[] args) {
		Scanner oldr= new Scanner(System.in);
		System.out.print("Enter The old Reading: ");
		int oldre= oldr.nextInt();
		
		Scanner newr= new Scanner(System.in);
		System.out.print("Enter The new Reading: ");
		int newre= newr.nextInt();
		int usedUnit = newre - oldre;
		System.out.println("this month used unit is: "+ usedUnit);
	}

	

	

}
