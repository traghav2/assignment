import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();
        
        System.out.println(GreetingFun(name));

    }

    public static String GreetingFun(String name) {
        return "Hello there " + name;
    }
}
