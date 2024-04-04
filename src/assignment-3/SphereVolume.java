import java.util.Scanner;

public class SphereVolume {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double radius;

        System.out.print("Enter radius: ");
        radius = in.nextDouble();

        double volume = 1.333 * (Math.PI * Math.pow(radius, 3));

        System.out.printf("Volume: %.2f", volume);
        in.close();
    }    
}
