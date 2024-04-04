import java.util.Scanner;
public class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = in.nextDouble();

        System.out.print("Enter width: ");
        double width = in.nextDouble();

        double perimeter = 2*(length+width);

        System.out.printf("Perimeter is: %.2f" , perimeter);
        in.close();
    }
}
