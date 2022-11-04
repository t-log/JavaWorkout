import java.util.Scanner;

public class Checker {
    public static void main(String[] args) {
        char letter;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character to be checked:");
        letter = sc.next().charAt(0);
        switch (Character.toLowerCase(letter))
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Is a vowel");
                break;
            default:
                System.out.println("Is a consonant");
                break;
        }
    }
}
