//To get name and age of a person demonstrating method
import java.util.Scanner;
public class MethodExersice1 {

    public static void main(String[] args) {
        System.out.println("Enter the name");
        System.out.println(name() + " " + age());
    }
    public static String name(){


        return new Scanner(System.in).nextLine();
    }

    public static int age() {

        return new Scanner(System.in).nextInt();
    }
}
