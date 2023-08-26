import java.util.Scanner;

public class perfectNumberFinder {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int total = 0;

        while (true){
            System.out.println("Please enter a number: ");

            if (scanner.hasNextInt()){
                number = scanner.nextInt();

                if (number > 0){
                    break;
                } else {
                    System.out.println("İnvalid input! Please enter a positive number!");
                }
            } else {
                System.out.println("İnvalid input! Please enter a valid number!");
                scanner.next();
            }
        }

        for (int i = 1; i < number; i++){
            if (number % i == 0){
                total += i;
            }
        }

        if (total == number){
            System.out.println("Entered number is PERFECT NUMBER!");
        } else {
            System.out.println("Entered number is NOT PERFECT NUMBER!");
        }
    }
}
