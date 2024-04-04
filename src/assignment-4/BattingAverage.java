import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter runs scored by batsman: ");
        int runsScored = in.nextInt();
        System.out.print("Enter runs scored by batsman: ");
        int timesOut = in.nextInt();
        

        double battingAverage = runsScored/timesOut;

        System.out.printf("Batting Average is: %.2f", battingAverage);
        in.close();
    }
}
