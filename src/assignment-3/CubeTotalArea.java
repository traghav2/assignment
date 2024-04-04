import java.util.Scanner;

public class CubeTotalArea{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double side;

        System.out.print("Enter side: ");
        side = in.nextDouble();


        double volume = 6 * Math.pow(side, 2);

        System.out.printf("Volume: %.2f", volume);
        in.close();
    }    
}
