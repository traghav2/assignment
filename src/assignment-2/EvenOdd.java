public class EvenOdd {
    public static void main(String[] args) {
        int num = 2;

        System.out.println(checkEvenOdd(num));
    }

    public static String checkEvenOdd(int num) {
        if(num % 2 == 0){
            return "Even";
        }return "Odd";
    }
}
