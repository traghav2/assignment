import java.util.Scanner;

public class InrToUsd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter in inr: ");
        float rupees = in.nextFloat();

        float dollars = (float)(83 * rupees);

        System.out.print("Dollars: " + dollars);

    }
}
