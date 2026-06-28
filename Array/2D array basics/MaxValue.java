import java.util.Scanner;

public class MaxValue {

    public static void main(String[] args) {

        int[][] arr = new int[2][2];
        Scanner sc = new Scanner(System.in);

        // Input
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int max = arr[0][0];

        // Finding Maximum
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] > max) {
                    max = arr[i][j];
                }

            }
        }

        System.out.println("Maximum value = " + max);

        sc.close();
    }
}