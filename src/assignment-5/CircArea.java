import java.util.Scanner;

public class CircArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of circle to get area and circumference: ");
        double radius = in.nextDouble();
        in.close();

        System.out.println("Area is : " + calculateArea(radius));
        System.out.println("Circumference is: " + calculateCircumference(radius));
    }   

    public static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}
