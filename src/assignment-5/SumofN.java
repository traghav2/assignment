import java.util.Scanner;

public class SumofN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = in.nextInt();

        in.close();

        System.out.print("Sum: "+ calculateSumNaturalNum(n));
    }    

    public static int calculateSumNaturalNum(int n){
        return n * (n+1)/2;
    }
}
