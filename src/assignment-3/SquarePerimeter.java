import java.util.Scanner;

public class SquarePerimeter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter side: ");
        double side = in.nextDouble();

        double perimeter = 4 * side;

        System.out.printf("Perimeter is: %.2f" , perimeter);
        in.close();
    }    
}
