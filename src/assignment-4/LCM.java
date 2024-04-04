import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = in.nextInt();

        System.out.print("Enter num2: ");
        int num2 = in.nextInt();
        in.close();

        int LCM = num1 * num2 / gcd(num1, num2);

        System.out.println("LCM is: "+ LCM);
    }

    public static int gcd(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            return num1 + num2;
        }

        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }

        return num1;
    }
}
