import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String args[]) {
        int n1 = 0, n2 = 1, n3, i;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter value of n: ");
        int n = in.nextInt();
        System.out.print(n1 + " " + n2);
        in.close();
        for (i = 2; i < n; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
