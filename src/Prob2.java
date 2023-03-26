public class Prob2 {
    public static void main(String[] args) {
        int[] myArr = {9, 23, 44, 31, 56, 21, 78, 65, 45, 34};

        int sum = 0;
        for (int element : myArr) {
            sum += element;
        }
        System.out.println(sum);

        int max = myArr[0];
        for (int element : myArr) {
            if (element > max) {
                max = element;
            }
        }
        System.out.println(max);
    }
}
