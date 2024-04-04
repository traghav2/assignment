import java.util.Scanner;
public class PerfectNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter num: ");
        int number = in.nextInt();
        int sum = 0;
        in.close();

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum == number) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
}