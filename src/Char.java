//program to check whether the character is vowel or consonant using switch
import java.util.Scanner;
public class Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char a = sc.next().charAt(0);
        switch (a){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }

    }
}
