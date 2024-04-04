import java.util.Scanner;

class CommissionPercentage{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Commission Amount: ");
        double commissionAmount = in.nextDouble();

        System.out.print("Enter Commission Amount: ");
        double revenue = in.nextDouble();

        double commissionPercentage = (commissionAmount/revenue) * 100;

        System.out.printf("Percentage of commission is: %.2f", commissionPercentage);
        System.out.println("%");
        in.close();
    }
}