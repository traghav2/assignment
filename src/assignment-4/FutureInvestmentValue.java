import java.util.Scanner;

public class FutureInvestmentValue {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter present value: ");
        double presentValue = in.nextInt();

        System.out.print("Enter the interest rate: ");
        double interestRate = in.nextInt();

        System.out.print("Enter the time period in years: ");
        double n = in.nextInt();

        double futureValue = presentValue * Math.pow((1 + (interestRate / 100)), n);
        System.out.printf("Future value is: %.2f", futureValue);

        in.close();
    }
}