import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num to check for Armstrong: ");
        int n = in.nextInt();

        System.out.println(checkArmStrong(n));
    }

    public static Boolean checkArmStrong(int n) {
        int temp = n; // 184
        String strLen = Integer.toString(n);
        int length = strLen.length();
        int result = 0;

        while(temp > 0) {
            int rem = temp % 10; // 4 8 1
            int remPow = (int)Math.pow(rem, length);
            result = result + remPow;
            temp /= 10; 
        }

        if(result == n){
            return true;
        }return false;
    }
}
