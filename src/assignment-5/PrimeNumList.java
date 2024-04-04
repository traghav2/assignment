import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumList {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first num of the range: ");
        int num1 = in.nextInt();

        System.out.print("Enter second num of the range: ");
        int num2 = in.nextInt();

        System.out.println(findPrimeNumbers(num1, num2));
        in.close();
    }

    public static ArrayList<Integer> findPrimeNumbers(int start, int end) {
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        for (int i = start; i <= end; i++) {
          if (isPrime(i)) {
            primeNumbers.add(i);
          }
        }
        return primeNumbers;
      }
      
      private static boolean isPrime(int number) {
        if (number <= 1) {
          return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
          if (number % i == 0) {
            return false;
          }
        }
        return true;
      }
}
