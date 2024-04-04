import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter num to check for palindrome: ");
        int n = in.nextInt();

        int temp = n;
        int result = 0;

        while(temp > 0){
            int rem = temp % 10;
            result = result * 10 + rem;
            temp /= 10;
        }

        if(result == n){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome!");
        }

        in.close();
    }    
}
