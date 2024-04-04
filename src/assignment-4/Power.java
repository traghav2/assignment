import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter num: ");
        int num = in.nextInt();
        System.out.print("Enter power: ");
        int power = in.nextInt();

        int result = 1;

        for(int i = 1; i <= power; i++) {
            result *= num;
        }

        System.out.println(result);
        in.close();
    }
}
