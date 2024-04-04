import java.util.Scanner;
public class SumofN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int n = in.nextInt();

        double result = n * (n+1)/2;

        System.out.println("Sum of "+ n + " terms is: " + result);
        in.close();
    }
}
