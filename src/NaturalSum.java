//To find the sum of n natural numbers
import java.util.Scanner;
public class NaturalSum {
    public static void main(String[] args) {
        System.out.println("Enter the value for n");
        Scanner natural = new Scanner(System.in);
        int n = natural.nextInt();
        int sum=0;
        for(int i = 0;i<=n;i++){
            sum+=i;
        }
        System.out.println("The sum of n natural number is: "+ sum);
    }
}
