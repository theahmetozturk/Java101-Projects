//https://app.patika.dev/theozturk

import java.util.Scanner;

public class Divisibility {

	public static void main(String[] args) {
		int number = 0, total = 0, avarage = 0, counter = 0;
		boolean isValid = true;
		Scanner inp = new Scanner(System.in);

		while (isValid) {
			System.out.println("Please enter a positive number: ");
			if (inp.hasNextInt()) {
				number = inp.nextInt();
				inp.nextLine();
				if (number < 0) {
					System.out.println("You have invalid login!!");
				} else
					isValid = false;
			} else {
				inp.nextLine();
			}

		}

		for (int i = 0; i < number; i++) {
			if (i % 12 == 0) {
				total = total + i;
				counter++;
			}
		}
		avarage = total / counter;

		System.out.println("Number's avarage is: " + avarage);
	}
}