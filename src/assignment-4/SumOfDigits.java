import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number to get digit sum: ");
        int n = in.nextInt();
        int sum = 0;
        in.close();

        while(n > 0){
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }

        System.out.print("Sum: "+sum);

    }    
}
