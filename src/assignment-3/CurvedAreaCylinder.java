import java.util.Scanner;

public class CurvedAreaCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double radius, height;

        System.out.print("Enter radius: ");
        radius = in.nextDouble();

        System.out.print("Enter height: ");
        height = in.nextDouble();

        double volume = 2 * Math.PI * radius * height;

        System.out.printf("Volume: %.2f", volume);
        in.close();
    }    
}
