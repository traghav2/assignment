import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number to check: ");
        int n = in.nextInt();

        System.out.println(checkArmstrong(n));
        in.close();
    }

    public static boolean checkArmstrong(int n) { // 153
        int temp = n;
        int length = Integer.toString(temp).length();
        int result = 0;

        while (temp > 0) {
            int rem = temp % 10;
            result += Math.pow(rem, length);
            temp /= 10;
        }

        if (result == n) {
            return true;
        }
        return false;
    }
}
