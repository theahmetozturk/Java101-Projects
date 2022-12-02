//https://app.patika.dev/theozturk

import java.util.Scanner;

public class EbobEkokCalculator {

	public static void main(String[] args) {

		int ebob = 1, ekok, i = 1;

		Scanner inp = new Scanner(System.in);

		System.out.println("Please enter positive first number: ");
		int number1 = inp.nextInt();

		System.out.println("Please enter positive second number: ");
		int number2 = inp.nextInt();

		while (i <= number1 && i <= number2) {
			if (number1 % i == 0 && number2 % i == 0) {
				ebob = i;
			}
			i++;
		}
		System.out.println("EBOB: " + ebob);
		ekok = (number1 * number2) / ebob;
		System.out.println("EKOK: " + ekok);

	}

}
