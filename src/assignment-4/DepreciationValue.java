import java.util.Scanner;

public class DepreciationValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the asset's initial value:");
        double initialValue = in.nextDouble();

        System.out.println("Enter the asset's salvage value:");
        double salvageValue = in.nextDouble();

        System.out.println("Enter the asset's useful life in years:");
        int usefulLife = in.nextInt();

        double annualDepreciation = (initialValue - salvageValue) / usefulLife;

        System.out.printf("The annual depreciation is: %.2f" , annualDepreciation);
        in.close();
    }    
}
