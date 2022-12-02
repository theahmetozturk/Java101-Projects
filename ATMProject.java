//https://app.patika.dev/theozturk

import java.util.Scanner;

public class ATMProject {

	public static void main(String[] args) {
		String userName, password;
		int right = 3, balance = 1500, select;

		Scanner inp = new Scanner(System.in);

		while (right > 0) {
			System.out.println("Please enter your USERNAME: ");
			userName = inp.nextLine();

			System.out.println("Please enter your PASSWORD");
			password = inp.nextLine();

			if (userName.equals("user1") && password.equals("12345")) {
				System.out.println("Welcome xxx Bank");

				System.out.println("1- Deposit Money\n" + "2- Take Money\n" + "3- Check Money\n" + "4- Quit");
				System.out.println("Please choose your process: ");
				select = inp.nextInt();

				switch (select) {
				case 1:
					System.out.println("Amount of Money : ");
					int price = inp.nextInt();
					balance += price;
					System.out.println("Your balance : " + balance);
					break;
				case 2:
					System.out.println("Amount of Money : ");
					price = inp.nextInt();
					if (price > balance) {
						System.out.println("Not enough money!!");
					} else {
						balance -= price;
					}
				case 3:
					System.out.println("Your balance : " + balance);
				case 4:
					System.out.println("See you again.");
				}
				break;
		
			} else {
				right--;
				System.out.println("Wrong username or password. Please try again!!");
				if (right == 0) {
					System.out.println("Your account blocked. Please contact with bank!!");
				} else {
					System.out.println("Your right : " + right);
				}
			}
		}
	}
}
