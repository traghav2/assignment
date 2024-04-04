import java.util.Scanner;

public class RhombusArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Diagonal 1: ");
        double diagonal1 = in.nextDouble();

        System.out.print("Diagonal 2: ");
        double diagonal2 = in.nextDouble();

        double area = 0.5 * diagonal1 * diagonal2;
        
        System.out.printf("Area is: %.2f", area);
        in.close();
    }    
}
