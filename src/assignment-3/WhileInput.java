import java.util.Scanner;

public class WhileInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;

        while(true){
            int num = in.nextInt();
            if(num == 0) {
                break;
            }

            sum += num;
        }

        System.out.print("Sum: " + sum);
    }
}
