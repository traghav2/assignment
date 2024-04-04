import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {

        double length;
        double width;
        double area;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        length = in.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        width = in.nextDouble();

        area = length * width;

        System.out.printf("The area of the triangle is: %.2f", area);
        in.close();
    }
}
