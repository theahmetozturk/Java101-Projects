import java.util.Scanner;

public class reverseTriangleDrawer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter row number: ");
        int rowNumber = input.nextInt();

        for (int i = rowNumber - 1; i >= 0; i--){
            for (int j = 0; j < rowNumber - i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < (i * 2) + 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}