package pkgMain;

import java.util.Scanner;

public class Tuition {
	public static void main(String[] args) {
		double totalCost = 0;
		Scanner input = new Scanner(System.in);

		System.out.print("What is the initial tuition cost? ");
		double baseTuition = input.nextDouble();

		System.out.print("What is the percentage increase in tuition each year? (Enter in decimal form) ");
		double percentInc = input.nextDouble();
		
		input.close();

		for (int counter = 1; counter <= 4; counter++) {
			if (counter != 1) {
				baseTuition = baseTuition * (1 + percentInc);
				totalCost += baseTuition;

			} else
				totalCost += baseTuition;
		}
		System.out.printf("The total tuition cost for four years is $%.2f%n",totalCost);
	}
}
