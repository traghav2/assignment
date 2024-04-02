import java.util.Scanner;

public class ParallelogramPerimeter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter base: ");
        double base = in.nextDouble();

        System.out.print("Enter side: ");
        double side = in.nextDouble();

        double perimeter = 2*(base+side);

        System.out.printf("Perimeter is: %.2f" , perimeter);
    }
}
