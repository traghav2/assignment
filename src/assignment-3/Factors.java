import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your num: ");
        int num = in.nextInt();

        System.out.println("Factors: ");
        for(int i = 1; i < num; i++) {
            if(num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
