import java.util.ArrayList;
import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        ArrayList<Integer> factorsNum1 = new ArrayList<Integer>();
        ArrayList<Integer> factorsNum2 = new ArrayList<Integer>();
        ArrayList<Integer> commonFactors = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = in.nextInt();

        System.out.print("Enter num2: ");
        int num2 = in.nextInt();

        in.close();

        factorsNum1 = factors(num1);
        factorsNum2 = factors(num2);

        System.out.println("Factors of num1: " + factorsNum1.toString());
        System.out.println("Factors of num2: " + factorsNum2.toString());


        int minSize = Math.min(factorsNum1.size(), factorsNum2.size());

        for(int i = 0; i < minSize; i++){
            if(factorsNum1.size() > factorsNum2.size()){
                if(factorsNum1.contains(factorsNum2.get(i))){
                    commonFactors.add(factorsNum2.get(i));
                }
            }else{
                if(factorsNum2.contains(factorsNum1.get(i))){
                    commonFactors.add(factorsNum1.get(i));
                }
            }
        }

        int HCF = commonFactors.getLast();
        System.out.println("Common Factors: " + commonFactors.toString());

        System.out.print("HCF: "+ HCF);

    }

    public static ArrayList<Integer> factors(int n){
        ArrayList<Integer> factorsList = new ArrayList<Integer>();
        
    
        for(int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factorsList.add(i);
            }
        }
        return factorsList;
    }
}
