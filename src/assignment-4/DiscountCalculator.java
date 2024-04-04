import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter discount(%): ");
        double discount = (double)in.nextDouble();
        System.out.print("Enter price of product: ");
        double price = (double)in.nextFloat();

        double difference = price * (discount/100);

        System.out.printf("Price after discount: %.2f", (price - difference));
        System.out.println();
        System.out.printf("Difference:  %.2f", difference);
        in.close();
    }    
}
