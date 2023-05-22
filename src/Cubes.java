import java.util.*;
public class Cubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three Numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double sum = (Math.pow(a,3) + Math.pow(b,3) + Math.pow(c,3));
        System.out.println("The sum of the cubes is: " +sum);
    }
}
