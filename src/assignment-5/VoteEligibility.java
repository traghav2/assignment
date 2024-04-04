import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = in.nextInt();


        boolean eligible = voteEligibility(age);
        if(eligible){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible!");
        }


        in.close();
    }    

    public static boolean voteEligibility(int age){
        if(age >= 18){
            return true;
        }else{
            return false;
        }
    }
}
