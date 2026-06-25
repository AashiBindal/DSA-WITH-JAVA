public class pattern2 {
    static void main() {
        System.out.println("solid rectangular pattern");
        int n = 3;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
