import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter values for Principal Time(in years) and Rate(annual rate): ");
        float time = in.nextFloat();
        float principal = in.nextFloat();
        float rate = in.nextFloat();

        System.out.println(CalculateSimpleInterest(principal, time, rate));
    }   

    public static float CalculateSimpleInterest(float principal, float time, float rate) {
        float simpleInterest = (float)((principal * time * rate) /  100);
        return simpleInterest;
    }
}
