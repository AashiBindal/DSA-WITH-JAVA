public class pattern19 {
    static void main() {
        int n = 4;
        for (int r = 1; r <= n; r++) {
            // part1 print space
            for (int c = 1; c <= n - r; c++) {
                System.out.print("  ");
            }
            // prt2

            for (int c = 1; c <= r; c++) {
                int a = c; // c=1,2,3...
                int b = 'A' - 1; // a=96
                int ans = a + b; // A = 96 -1 +1 , b = 96-1 +2 , c= 96 -1+3........
                char finalAns = (char) ans;
                System.out.print(finalAns + " ");
            }
            // part3
            char toprint = (char) (r + 'A' - 2);
            for (int c = 1; c <= r - 1; c++) {
                System.out.print(toprint + " ");
                toprint--;
            }
            System.out.println();
        }
    }
}
