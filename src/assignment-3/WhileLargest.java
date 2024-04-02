import java.util.Scanner;

public class WhileLargest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int largest = 0;

        while(true){
            int num = in.nextInt();
            if(num == 0) {
                break;
            }else if (num > largest) {
                largest = num;
            }
        }

        System.out.print("Largest: " + largest);
    }
}
