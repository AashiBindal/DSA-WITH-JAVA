class pattern10 {
    static void main() {
        System.out.println("hollow pyramid");
        int n = 5;
        for (int row = 1; row <= n; row++) {
            // part 1 spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }
            // part 2

            if (row == 1 || row == n) {
                for (int col = 1; col <= 2 * row - 1; col++) {
                    System.out.print("* ");
                }

            } else {
                // middle rows
                // 1*
                System.out.print("* ");
                // space
                for (int col = 1; col <= 2 * row - 3; col++) {
                    System.out.print("  ");
                }
                // 1*
                System.out.print("* ");

            }
                // move to next row
                System.out.println();
        }
    }

}