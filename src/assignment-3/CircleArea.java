import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {

        double radius;
        double pi = Math.PI; 
        double area;
    
        // Prompt user for input (optional)
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = in.nextDouble();
        area = pi * radius * radius;

        System.out.printf("The area of the circle is: %.2f", area);
        in.close();
      }
}
