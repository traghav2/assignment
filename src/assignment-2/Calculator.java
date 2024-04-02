import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int result = -1;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = in.nextInt();
        System.out.print("Enter num2: ");
        int num2 = in.nextInt();

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice: ");
        int choice = in.nextInt();

        switch(choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3: 
                result = num1 * num2;
                break;
            case 4: 
                result = num1 / num2;
                break;
            default:
                result = -1;
                break;
        }

        if(result == -1){
            System.out.println("Invalid Choice");
        }else{
            System.out.println("Result: "+result);
        }
    }   
}
