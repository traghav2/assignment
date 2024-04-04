import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.print("Enter total percentage: ");
        double totalPercentage = in.nextDouble();

        System.out.print("Enter number of semesters: ");
        int sems = in.nextInt();

        double CGPA = (totalPercentage / sems) / 9.5;

        System.out.printf("CGPA: %.2f", CGPA);
        in.close();
    }
}
