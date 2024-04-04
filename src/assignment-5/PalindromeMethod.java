import java.util.Scanner;

public class PalindromeMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter num to check for palindrome: ");
        int n = in.nextInt();

        System.out.println(checkPalindrome(n));
        in.close();
    }    

    
    public static boolean checkPalindrome(int n){
        int temp = n;
        int result = 0;

        while(temp > 0){
            int rem = temp % 10;
            result = result * 10 + rem;
            temp /= 10;
        }

        if(result == n){
            return true;
        }

        return false;
    }
}
