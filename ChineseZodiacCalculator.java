//https://app.patika.dev/theozturk

import java.util.Scanner;

public class ChineseZodiacCalculator {

	public static void main(String[] args) {
		int birthDate = 0, result;
		boolean isValid = true;

		Scanner input = new Scanner(System.in);

		while (isValid) {
			System.out.println("Please enter your birthdate: ");
			if (input.hasNextInt()) {
				birthDate = input.nextInt();
				input.nextLine();
				if (birthDate < 0) {
					System.out.println("You have invalid login!!" );
				} else
					isValid = false;
			} else {
				input.nextLine();
			}

		}
		
		result = birthDate % 12;
		
		if(result == 0) {
			System.out.println("You zodiac horoscope is  * MONKEY * ");
		}else if(result == 1) {
			System.out.println("You zodiac horoscope is  * COCK * ");
		}else if(result == 2) {
			System.out.println("You zodiac horoscope is  * DOG * ");
		}else if(result == 3) {
			System.out.println("You zodiac horoscope is  * PİCK * ");
		}else if(result == 4) {
			System.out.println("You zodiac horoscope is  * MOUSE * ");
		}else if(result == 5) {
			System.out.println("You zodiac horoscope is  * OX * ");
		}else if(result == 6) {
			System.out.println("You zodiac horoscope is  * TIGER * ");
		}else if(result == 7) {
			System.out.println("You zodiac horoscope is  * RABBIT * ");
		}else if(result == 8) {
			System.out.println("You zodiac horoscope is  * DRAGON * ");
		}else if(result == 9) {
			System.out.println("You zodiac horoscope is  * SNAKE * ");
		}else if(result == 10) {
			System.out.println("You zodiac horoscope is  * HOURSE * ");
		}else if(result == 11) {
			System.out.println("You zodiac horoscope is  * SHIP * ");
		}
	}
}
