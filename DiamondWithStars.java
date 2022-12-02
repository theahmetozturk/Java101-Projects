//https://app.patika.dev/theozturk

import java.util.Scanner;

public class DiamondWithStars {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.println("Please enter a positive number");
		int number = inp.nextInt();

		for (int i = 1; i <= number; i++) {
			for (int k = 1; k <= (number - i); k++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= (2 * i) - 1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		for (int i = number - 1; i >= 1; i--) {
			for (int p = 1; p <= number - i; p++) {
				System.out.print(" ");
			}
			for (int r = 1; r <= (i * 2) - 1; r++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

}
