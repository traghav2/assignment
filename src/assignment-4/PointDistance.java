import java.util.Scanner;

public class PointDistance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter coordinates of first point:");
        double x1 = in.nextDouble();
        double x2 = in.nextDouble();
        
        System.out.println("Enter coordinates of second point:");
        double y1 = in.nextDouble();
        double y2 = in.nextDouble();

        double distance = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));

        System.out.printf("Distance between both points: %.2f" , distance);
        in.close();

    }
}
