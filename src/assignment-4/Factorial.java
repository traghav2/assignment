import java.util.Scanner;

class Factorial{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int result = 1;
        for(int i = num; i > 0 ;i--){
            result *= i;
        }

        System.out.print("Factorial: " + result);
        in.close();
    }
}