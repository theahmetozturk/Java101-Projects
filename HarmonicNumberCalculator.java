//https://app.patika.dev/theozturk

import java.util.Scanner;

public class HarmonicNumberCalculator {

	public static void main(String[] args) {
		
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Please enter a positive numebr");
		int number = inp.nextInt();
		
		double total = 0;
		
		for(double i = 1; i <= number; i++) {
			total += (1/i);
		}
		System.out.println(total);
	}

}
