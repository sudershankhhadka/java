import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int [] array = new int[size];
        for(int i= 0;i<size;i++){
            System.out.println("Enter the " + (i+1) + " index value");
           array[i] = input.nextInt();

        }
        input.close();
        System.out.println("The array is:");
        for(int i = 0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
