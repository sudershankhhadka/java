//To find the reverse of a number
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        System.out.println("Enter the number to be reversed:");
        Scanner rev = new Scanner(System.in);
        int number = rev.nextInt();
        int temp,sum=0;
        while(number!=0){
            temp = number % 10;
            sum = (sum*10)+temp;
            number /= 10;


        }
        System.out.println("The reversed number is : "+sum);
    }
}
