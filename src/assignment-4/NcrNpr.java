import java.util.Scanner;

public class NcrNpr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("enter value of n: ");
        int n = in.nextInt();

        System.out.print("Enter value of r: ");
        int r = in.nextInt();

        
        if (r > n) {
            System.out.println("Invalid input: r cannot be greater than n.");
            in.close();
            return;
        }

        System.out.println("Enter C for combination P for permutation: ");
        char choice = in.next().charAt(0);

        switch(choice){
            case 'C':
                System.out.println(combination(n, r));
                break;
            case 'P':
                System.out.println(permutation(n, r));
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
        in.close();
    }

    public static int combination(int n, int r){
        int ncr = factorial(n) / ((factorial(r)*factorial(n-r)));
        return ncr;
    }

    public static int permutation(int n, int r){
        int npr = factorial(n) / factorial(n-r);
        return npr;
    }

    public static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }
}
