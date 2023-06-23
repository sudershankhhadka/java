
import java.util.Scanner;
public class GivingInputInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the rows of the array");
        int rows = input.nextInt();
        System.out.println("Enter the columns");
        int cols = input.nextInt();

        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter the element at the index:(" + i + ", " + j + "):");
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("The array is:");

        //displaying the array

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
