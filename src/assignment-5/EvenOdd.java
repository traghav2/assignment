import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num to check even or odd: ");
        int num = in.nextInt();
        in.close();

        if(num % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }    
}
