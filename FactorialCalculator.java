//https://app.patika.dev/theozturk

import java.util.Scanner;

public class FactorialCalculator {

	public static void main(String[] args) {
		int number1 = 1, number2  = 1, result = 0, total1 = 1, total2 = 1, total3 = 1;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Please enter number of clusters:  \n"+"C(n,r) =>**You should enter for n**");
		number1 = inp.nextInt();
		
		System.out.println("Please enter number of subclusters:  \n"+"C(n,r) =>**You should enter for r**");
		number2 = inp.nextInt();
		
		if  (number1 < number2) {
			System.out.println("You entered a invalid login \n"+"**Number of clusters must be bigger than number of subclusters**");
			return;
		}
		
		for(int i = 1; i <= number1; i++) {
			total1 *= i;
		}
		
		for(int i = 1; i <= number2; i++) {
			total2 *= i;
		}
		
		for(int i = 1; i <= (number1-number2); i++) {
			total3 *= i;
		}
		
		result = total1 / (total2 * (total3));
		
		System.out.println("Result is: "+ "**" +result+ "**");

	}

}
