import java.util.Scanner;

public class PyramidVolume {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double baseLength, baseWidth, height;

        System.out.print("Enter base length: ");
        baseLength = in.nextDouble();

        System.out.print("Enter base width: ");
        baseWidth = in.nextDouble();

        System.out.print("Enter height: ");
        height = in.nextDouble();

        double volume = (baseLength* baseWidth* height)/3;

        System.out.printf("Volume: %.2f", volume);
        in.close();
    }    
}
