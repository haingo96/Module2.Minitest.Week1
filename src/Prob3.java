import java.util.Arrays;
import java.util.Scanner;

public class Prob3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input array length:");
        int lengthArr = scn.nextInt();

        double[] myArr = new double[lengthArr];
        for (int i = 0; i < lengthArr; i++) {
            System.out.println("Input next array element:");
            myArr[i] = scn.nextDouble();
        }

        System.out.println(Arrays.toString(myArr));
    }
}
