//https://app.patika.dev/theozturk

import java.util.Scanner;

public class FourAndFive {

	public static void main(String[] args) {

		int number, i;

		Scanner inp = new Scanner(System.in);
		
		System.out.println("Please enter a positive number of limits: ");
		number = inp.nextInt();
		
		System.out.println("Forces of Five");
		for(i = 1; i <= number; i *= 5) {
			System.out.println(i);
		}
		
		System.out.println("Forces of Four");
		for(i = 1; i <= number; i *= 4) {
			System.out.println(i);
		}

	}

}
