import java.util.Scanner;

public class TakingInput {
  static void main() {
    int arr[][] = new int[3][4];
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.println("provide value for rows =  " + i + "  provide value for column=  " + j);
        arr[i][j] = sc.nextInt();

// i<n or i<=n-1 

      }
    }
    for (int rowIndex = 0; rowIndex <= arr.length - 1; rowIndex++) {
      for (int colIndex = 0; colIndex <= arr[rowIndex].length - 1; colIndex++) {
        System.out.print(arr[rowIndex][colIndex] + " ");
      }
      System.out.println();

    }

    sc.close();
  }
}
