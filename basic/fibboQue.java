import java.util.Scanner;

public class fibboQue {

    public static void main(String[] args) {

        Scanner ab = new Scanner(System.in);

        System.out.print("Find the nth Fibonacci number: ");
        int n = ab.nextInt();

        if (n == 0) {
            System.out.println(0);
        } else if (n == 1) {
            System.out.println(1);
        } else {

            int prev = 0;
            int curr = 1;
            int count = 2;

            while (count <= n) {
                int temp = curr;
                curr = curr + prev;
                prev = temp;
                count++;
            }

            System.out.println(curr);
        }

        ab.close();
    }
}