import java.util.Scanner;

public class MaxMin {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = in.nextInt();

        printMaximum(num1, num2, num3);
        printMinimum(num1, num2, num3);

        in.close();
    }

    public static void printMaximum(int a, int b, int c) {
        int max = 0;

        if (a > b) {
            if (a > c) {
                max = a;
            } else {
                max = c;
            }
        } else if (b > a) {
            if (b > c) {
                max = b;
            } else {
                max = c;
            }
        } else {
            max = c;
        }

        System.out.println("The maximum number is: " + max);
    }

    public static void printMinimum(int a, int b, int c) {
        int min = 0;
        if (a < b) {
            if (a < c) {
                min = a;
            } else {
                min = c;
            }
        } else if (b < a) {
            if (b < c) {
                min = b;
            } else {
                min = c;
            }
        } else {
            min = c;
        }

        System.out.println("The minimum number is: " + min);
    }
}
