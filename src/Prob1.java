import java.util.Scanner;

public class Prob1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input your number:");
        int input = scn.nextInt();

        for (int i = 2; i < input; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int i) {
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
