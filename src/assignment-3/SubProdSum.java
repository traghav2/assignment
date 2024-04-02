import java.util.Scanner;

public class SubProdSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int num = in.nextInt();
        int prodNum = 1;
        int sumNum = 0;

        while(num > 0){
            int rem = num % 10;
            prodNum *= rem;
            sumNum += rem;
            num /= 10;
        }

        int result = prodNum - sumNum;

        System.out.println("Subtraction of prodNum and sumNum is: " + result);
    }
}
