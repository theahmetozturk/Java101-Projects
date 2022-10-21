import java.util.Scanner;

public class HackerRankChallenge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			Scanner input = new Scanner(System.in);
			try {
				print(input.nextLong(), input);
			} catch (Exception e) {
				System.out.println(input.next() + " can't be fitted anywhere.");
			}
		}

	}

	public static void print(long T, Scanner s) {

		String t1 = (T >= -128 && T <= 127) ? " \n * byte" : " ";
		String t2 = (T >= -32768 && T <= 32767) ? "\n * short" : " ";
		String t3 = (T >= Math.pow(-2, 31) && T <= Math.pow(2, 31) - 1) ? "\n * int" : " ";
		String t4 = (T >= Math.pow(-2, 63) && T <= Math.pow(2, 63) - 1) ? "\n * long " : " ";

		System.out.print(T + " can be fitted in:");
		System.out.print(t1);
		System.out.print(t2);
		System.out.print(t3);
		System.out.println(t4);

	}

}