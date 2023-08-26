import java.util.Scanner;

public class findMinMax {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers you wanna enter?");
        int numCount = scanner.nextInt();

        if (numCount <= 0){
            System.out.println("Please enter a valid number!!");
            scanner.close();
            return;
        }

        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 1; i <= numCount; i++){
            System.out.println(i + ". number: ");
            int number = scanner.nextInt();

            minNumber = Math.min(minNumber, number);
            maxNumber = Math.max(maxNumber, number);
        }

        System.out.println("Min number is: "+ minNumber);
        System.out.println("Max number is: "+ maxNumber);
    }
}
