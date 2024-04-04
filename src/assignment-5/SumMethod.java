import java.util.Scanner;

public class SumMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter num1: ");
        int num1 = in.nextInt();

        System.out.println("Enter num2: ");
        int num2 = in.nextInt();

        in.close();

        System.out.println("Sum of both numbers is: " + sum(num1, num2));
    }    

    public static int sum(int num1, int num2){
        return num1+num2;
    }
}
