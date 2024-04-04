import java.util.ArrayList;
import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {

        ArrayList<Character> vowels = new ArrayList<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        Scanner in = new Scanner(System.in);

        System.out.print("Enter character to check if it's a vowel or a consonant: ");
        char c = in.next().charAt(0);
        in.close();

        if(vowels.contains(c)){
            System.out.println("Vowel");
        }else{
            System.out.println("Consonant");
        }
    }
}
