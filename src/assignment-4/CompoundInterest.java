import java.util.Scanner;

public class CompoundInterest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = in.nextDouble();

        System.out.print("Enter the interest rate: ");
        double rate = in.nextDouble();

        System.out.print("Enter the time period in years: ");
        int time = in.nextInt();

        double amount = principal * Math.pow(1 + rate / 100, time);
        double compoundInterest = amount - principal;

        System.out.printf("The compound interest is: %.2f" , compoundInterest);
        in.close();
    }
}