import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n to get fibonacci sequence: ");
        int n = in.nextInt();

        getFiboSequence(n);
    }   

    public static void getFiboSequence(int n) {
        int prev = 0;
        int next = 1;

        System.out.println(prev + " ");
        System.out.println(next + " ");
    
        for(int i = 0; i < n; i++) {
            int temp = prev;
            prev = next;
            next = temp + next; // 1

            System.out.println(next);
        }

    }
}
