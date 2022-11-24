//https://app.patika.dev/theozturk

import java.util.Scanner;

public class LeapYearCalculator {

	public static void main(String[] args) {
		int year = 0;
		boolean isValid = true;

		Scanner input = new Scanner(System.in);

		while (isValid) {
			System.out.println("Please enter the year: ");
			if (input.hasNextInt()) {
				year = input.nextInt();
				input.nextLine();
				if (year < 0) {
					System.out.println("You have invalid login!!");
				} else
					isValid = false;
			} else {
				input.nextLine();
			}

		}

		if (year % 100 == 0) {
			if (year % 400 == 0) {
				System.out.println(year + " is a leap year !");
			} else {
				System.out.println(year + " is not a leap year !");
			}
		}else if(year % 4 == 0) {
			System.out.println(year + " is a leap year !");
		}else {
			System.out.println(year + " is not a leap year !");
		}
	}
}