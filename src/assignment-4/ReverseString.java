import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your string to reverse: ");
        String str = in.nextLine();

        for(int i = str.length() - 1; i >= 0; i--){
            System.out.print(str.charAt(i));
        }

        in.close();
    }    
}
