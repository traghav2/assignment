import java.util.Scanner;

public class IsoscelesArea {
  public static void main(String[] args) {

    double side;
    double height;
    double area;
    double base;

    Scanner in = new Scanner(System.in);
    System.out.print("Enter the equal side of the triangle: ");
    side = in.nextDouble();
    System.out.print("Enter the base of the triangle: ");
    base = in.nextDouble();

    height = Math.sqrt(Math.pow(side, 2) - (Math.pow(base, 2) / 4 ));

    area = 0.5 * base * height;

    System.out.printf("The area of the triangle is: %.2f", area);
    in.close();
  }
}
