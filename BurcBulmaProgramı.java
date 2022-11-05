//https://app.patika.dev/theozturk

import java.util.Scanner;

public class BurcBulmaProgramı {

	public static void main(String[] args) {
		int day = 1, month = 1;
		boolean isValid = true;
		Scanner input = new Scanner(System.in);

		while (isValid) {
			System.out.println("Please enter the month that you were born(AS A NUMBER): ");
			if (input.hasNextInt()) {
				month = input.nextInt();
				input.nextLine();
				if (!(month <= 12 && month > 0)) {
					System.out.println("Please enter a valid number");
				} else
					isValid = false;
			} else {
				System.out.println("You should enter a number");
				input.nextLine();
			}

		}

		isValid = true;
		int dayFinish;
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			dayFinish = 31;
		} else if (month == 2) {
			dayFinish = 29;

		} else {
			dayFinish = 30;
		}

		while (isValid) {
			System.out.println("Please enter the day that you were born(AS A NUMBER):");
			if (input.hasNextInt()) {
				day = input.nextInt();
				input.nextLine();
				if (day <= 0 || day > dayFinish) {
					System.out.println("Please enter a valid number");
				} else {
					isValid = false;
				}
			} else {
				System.out.println("Please enter the day as number");
				input.nextLine();
			}

		}
		
		if(month == 1) {
			if(day <= 21) {
				System.out.println("Your horoscope is **Capricorn**");
			}else {
				System.out.println("Your horoscope is **Aquarius**");
			}
		}else if(month == 2) {
			if(day <= 19) {
				System.out.println("Your horoscope is **Aquarius**");
			}else {
				System.out.println("Your horoscope is **Pisces**");
			}
		}else if(month == 3) {
			if(day <= 20) {
				System.out.println("Your horoscope is **Pisces**");
			}else {
				System.out.println("Your horoscope is **Aries**");
			}
		}else if(month == 4) {
			if(day <= 20) {
				System.out.println("Your horoscope is **Aries**");
			}else {
				System.out.println("Your horoscope is **Taurus**");
			}
		}else if(month == 5) {
			if(day <= 21) {
				System.out.println("Your horoscope is **Taurus**");
			}else {
				System.out.println("Your horoscope is **Gemini**");
			}
		}else if(month == 6) {
			if(day <= 22) {
				System.out.println("Your horoscope is **Gemini**");
			}else {
				System.out.println("Your horoscope is **Cancer**");
			}
		}else if(month == 7) {
			if(day <= 22) {
				System.out.println("Your horoscope is **Cancer**");
			}else {
				System.out.println("Your horoscope is **Leo**");
			}
		}else if(month == 8) {
			if(day <= 22) {
				System.out.println("Your horoscope is **Leo**");
			}else {
				System.out.println("Your horoscope is **Virgo**");
			}
		}else if(month == 9) {
			if(day <= 22) {
				System.out.println("Your horoscope is **Virgo**");
			}else {
				System.out.println("Your horoscope is **Libra**");
			}
		}else if(month == 10) {
			if(day <= 22) {
				System.out.println("Your horoscope is **Libra**");
			}else {
				System.out.println("Your horoscope is **Scorpio**");
			}
		}else if(month == 11) {
			if(day <= 21) {
				System.out.println("Your horoscope is **Scorpio**");
			}else {
				System.out.println("Your horoscope is **Sagittarius**");
			}
		}else {
			if(day <= 21) {
				System.out.println("Your horoscope is **Sagittarius**");
			}else {
				System.out.println("Your horoscope is **Capricorn**");
			}
			
		}
	}

}
