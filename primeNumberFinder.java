public class primeNumberFinder {
    public static void main(String[] args){
        int max = 100;

        System.out.println("Prime number that between 1-"+ max + " is: ");
        for (int i = 2; i <= max; i++){
            if (isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;

    }
}

