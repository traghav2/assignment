import java.util.*;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numerator = 0;
        List<Integer> numList = new ArrayList<Integer>();

        System.out.println("Enter marks of all subjects to get average: ");

        while(true){
            int num = in.nextInt(); 
            if(num == 0){
                break;
            }

            numList.add(num);
            numerator += num;
        }

        int denominator = numList.size();
        double average = numerator / denominator;

        System.out.print("Average of numbers entered is: " + average);
        in.close();
    }
}
