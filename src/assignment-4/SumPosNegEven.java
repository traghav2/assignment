import java.util.Scanner;

public class SumPosNegEven {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sumNegative = 0;
        int sumEven = 0;
        int sumOdd = 0;

        while (true) {
            System.out.print("Enter a number (0 to terminate): ");
            int num = in.nextInt();

            if (num == 0) {
                break;
            }

            if (num < 0) {
                sumNegative += num;
            } else if (num > 0) {
                if (num % 2 == 0) {
                    sumEven += num;
                } else {
                    sumOdd += num;
                }
            }
        }

        in.close();

        System.out.println("Sum of negative numbers: " + sumNegative);
        System.out.println("Sum of positive even numbers: " + sumEven);
        System.out.println("Sum of positive odd numbers: " + sumOdd);
    }
}
