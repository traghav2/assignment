import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers to check for pythagorean triplet: ");        

        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        System.out.println(isPythagoreanTriplet(num1, num2, num3));
        in.close();
    }

    public static boolean isPythagoreanTriplet(int a, int b, int c) {
        return a * a + b * b == c * c;
      }
}
