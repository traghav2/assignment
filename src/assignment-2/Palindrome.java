import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(checkPalindrome(n));
    }

    public static Boolean checkPalindrome(int n) {
        int temp = n; // 184
        int result = 0;

        while(temp > 0) {
            int rem = temp % 10; // 4 8 1
            result = result * 10 + rem;
            temp /= 10; 
        }

        if(result == n){
            return true;
        }return false;
    }
}
