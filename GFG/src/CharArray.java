import java.util.Scanner;
public class CharArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name length");
        int rows = input.nextInt();
        char []arr = new char[rows];
        System.out.println("Enter the characters of the name");
        for(int i = 0;i<rows;i++){
            arr[i] = input.next().charAt(0);
        }
    //displaying the array
        System.out.println("The neme is :");
        for(int i =0;i<rows;i++){
            System.out.print(arr[i]);
        }

    }
}
