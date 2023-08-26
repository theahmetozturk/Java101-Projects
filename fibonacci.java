import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number for fibonacci series length: ");
        int num = scanner.nextInt();

        System.out.println("Fibonacci series is: ");
        for (int i = 0; i < num; i++){
            System.out.println(fibonacciFinder(i)+" ");
        }
    }

    public static int fibonacciFinder(int num){
        if (num <= 1){
            return num;
        } else {
            return fibonacciFinder(num-1) + fibonacciFinder(num-2);
        }
    }
}
