//https://app.patika.dev/theozturk

import java.util.Scanner;

public class FlightPriceCalculator {

	public static void main(String[] args) {
		double distance = 0, totalPrice = 0, perPrice = 0.10, discountPrice = 0, price = 0;
		int age = 0, journeyType = 0;
		boolean isValid = true;

		Scanner input = new Scanner(System.in);

		while (isValid) {
			System.out.println("Please enter the distance in Km: ");
			if (input.hasNextInt()) {
				distance = input.nextInt();
				input.nextLine();
				if (distance < 0) {
					System.out.println("You have invalid login!!" + "\n" + "You should enter positive number");
				} else
					isValid = false;
			} else {
				input.nextLine();
			}
		}
		isValid = true;
		while (isValid) {
			System.out.println("Please enter your age: ");
			if (input.hasNextInt()) {
				age = input.nextInt();
				input.nextLine();
				if (age < 0) {
					System.out.println("You have invalid login!!" + "\n" + "You should enter positive number");
				} else
					isValid = false;
			} else {
				input.nextLine();
			}
		}
		isValid = true;
		while (isValid) {
			System.out.println("Please enter your journey type:\n1 => One Way, 2 => Round Trip");
			if (input.hasNextInt()) {
				journeyType = input.nextInt();
				input.nextLine();
				if (journeyType != 1 && journeyType != 2) {
					System.out.println("You have invalid login!!" + "\n" + "You should enter 1 or 2");

				} else {
					isValid = false;
				}
			} else {
				input.nextLine();
			}
		}

		totalPrice = distance * 0.10;

		if (age < 12) {
			if (journeyType == 2) {
				discountPrice = totalPrice - totalPrice * 0.50;
				price = discountPrice - discountPrice * 0.20;
				System.out.println("Total Price :" + price * 2);
			} else {
				price = totalPrice - totalPrice * 0.50;
				System.out.println("Total Price :" + price);
			}
		} else if (age > 12 && age < 24) {
			if (journeyType == 2) {
				discountPrice = totalPrice - totalPrice * 0.10;
				price = discountPrice - discountPrice * 0.20;
				System.out.println("Total Price :" + price * 2);
			} else {
				price = totalPrice - totalPrice * 0.10;
				System.out.println("Total Price :" + price);
			}
		} else if (age > 65) {
			if (journeyType == 2) {
				discountPrice = totalPrice - totalPrice * 0.30;
				price = discountPrice - discountPrice * 0.20;
				System.out.println("Total Price :" + price * 2);
			} else {
				price = totalPrice - totalPrice * 0.30;
				System.out.println("Total Price :" + price);
			}

		} else {
			if (journeyType == 2) {
				discountPrice = totalPrice - totalPrice * 0.20;
				System.out.println("Total Price: " + discountPrice * 2);
			} else {
				System.out.println("Total Price: " + totalPrice);
			}

		}

	}
}