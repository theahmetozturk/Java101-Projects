//https://app.patika.dev/theozturk

import java.util.Scanner;

public class NumberOfStepsCalculator {

	public static void main(String[] args) {
		int result = 0;

		Scanner inp = new Scanner(System.in);

		System.out.println("Please enter a positive number");
		int number = inp.nextInt();
		
		do {
			result += number %10;
			number /= 10;
		}while(number > 0);
		
		System.out.println(result);
	
	}

}
