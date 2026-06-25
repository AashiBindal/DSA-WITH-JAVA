import java.util.Scanner;

public class calculatorQue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Enter operation (+, -, *, /, %,^, x to exit):");
            char op = sc.next().trim().charAt(0);

            if (op == 'x' || op == 'X') {
                break;
            }

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%' || op =='^') {

                System.out.println("Enter two numbers:");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                int ans = 0;

                if (op == '+') {
                    ans = num1 + num2;
                } else if (op == '-') {
                    ans = num1 - num2;
                } else if (op == '*') {
                    ans = num1 * num2;

                }
                else if(op == '^') {
                    ans = (int) Math.pow(num1, num2);
                }
                
                else if (op == '/') {

                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("Cannot divide by zero");
                        continue;
                    }

                } else if (op == '%') {

                    if (num2 != 0) {
                        ans = num1 % num2;
                    } else {
                        System.out.println("Cannot divide by zero");
                        continue;
                    }
                }

                System.out.println("Answer = " + ans);

            } else {
                System.out.println("Invalid Operation");
            }
        }

        System.out.println("Thank you for using the calculator");
        sc.close();
    }
}