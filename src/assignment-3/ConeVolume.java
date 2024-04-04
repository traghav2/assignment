import java.util.Scanner;

public class ConeVolume {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double radius, height;

        System.out.print("Enter radius: ");
        radius = in.nextDouble();
        System.out.print("Enter height: ");
        height = in.nextDouble();

        double volume = (Math.PI * Math.pow(radius, 2)) * height/3;

        System.out.printf("Volume: %.2f", volume);
        in.close();
    }    
}
