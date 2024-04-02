import java.util.Scanner;

public class EquilateralArea {
    public static void main(String[] args) {

        double side;
        double height;
        double area;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side of the triangle: ");
        side = in.nextDouble();
        height = (Math.sqrt(3) * Math.pow(side, 2)) / 4;

        area = 0.5 * side * height;

        System.out.printf("The area is: %.2f", area);
    }
}
