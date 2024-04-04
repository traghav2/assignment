import java.util.Scanner;

public class PrismVolume {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double base, height;

        System.out.print("Enter base: ");
        base = in.nextDouble();
        System.out.print("Enter height: ");
        height = in.nextDouble();

        double volume = base * height;

        System.out.printf("Volume: %.2f", volume);
        in.close();
    }    
}
