//https://app.patika.dev/theozturk

import java.util.Scanner;

public class EvenNumberTotalFind {

	public static void main(String[] args) {
		int number, total = 0; 
		
		Scanner inp = new Scanner(System.in);
		
		do {
			System.out.println("Please enter positive number: ");
			number = inp.nextInt();
			
			if(number % 4 ==0) {
				total += number;
			}
		}while((number % 2 == 0));
		
		System.out.println("Result is: " + total);
	}

}

