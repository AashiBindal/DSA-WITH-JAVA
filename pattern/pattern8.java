public class pattern8 {
    static void main() {
        System.out.println("hollow rectengle pattern");
        int n = 4;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= 6; col++) {
                if (row == 1 || row == n) {
                    System.out.print("* ");
                } else {
                    if (col == 1) {
                        System.out.print("* ");
                    } else if (col == 6) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();

        }

    }
}
