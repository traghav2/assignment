import java.util.Scanner;

public class ParallelogramArea {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Length: ");
        double length = in.nextDouble();
        System.out.print("Breadth: ");
        double breadth = in.nextDouble();
        System.out.print("Angle: ");
        int angle = in.nextInt();
        double sin_x = Math.sin(Math.toRadians(angle));
 
        double area_parallelogram = length * breadth * sin_x;

        System.out.printf("Area of the parallelogram = %.2f" ,area_parallelogram);
    }    
}
