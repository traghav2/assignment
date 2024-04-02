import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first num: ");
        int num1 = in.nextInt();
        System.out.println();
        System.out.print("Enter num2: ");
        int num2 = in.nextInt();
        
        if(num1 > num2) {
            System.out.println(num1+" is greater than "+num2);
        }else{
            System.out.println(num2+" is greater than "+num1);
        }
    }
}
