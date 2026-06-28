import java.util.Scanner;

public class Minvalue {

    public static void main(String[] args) {

        int[][] arr = new int[2][2];
        Scanner sc = new Scanner(System.in);

        // Input
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int min = arr[0][0];

        // Finding Minimum
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] < min) {
                    min = arr[i][j];
                }

            }
        }

        System.out.println("Minimum value = " + min);

        sc.close();
    }
}