public class Diagonal {
    static void main() {
        int arr[][] = {
                { 1, 2, 3 },
                { 5, 4, 6 },
                { 7, 9, 8 },
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    System.out.println(arr[i][j]);
                }
            }
        }
        System.out.println("sum of diagonal element : ");
        int Sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    Sum += arr[i][j];
                }

            }

        }
        System.out.println(Sum);
    }
}
