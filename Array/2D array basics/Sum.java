    import java.util.Scanner;
public class Sum {
   


  static void main() {
    int arr[][] = new int[2][2];
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.println("provide value for rows =  " + i + "  provide value for column=  " + j);
        arr[i][j] = sc.nextInt();
}
    }
    int sum = 0 ;
  for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        int value = arr[i][j] ;
        sum = sum + value ;
      }
    }
     System.out.println( " sum = " + sum);

    sc.close();
}
}
