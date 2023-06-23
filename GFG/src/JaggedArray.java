//Program to Demonstrate 2D array in Java

public class JaggedArray {
    public static void main(String[] args) {
        //declaring 2D  array
        int [][]arr = new int[2][];
        //making jagged array
        //making first row of 2 columns  and second row of 4 columns
        arr[0] = new int[3];
        arr[1] = new int[5];

        //initialing the array
        int count = 0;
        for(int i=0;i< arr.length;i++)
            for(int j=0;j<arr[i].length;j++)
                arr[i][j] = count++;

        //displaying the jagged array

        System.out.println("The Jagged array is :");
        for(int i = 0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");

            System.out.println();
        }
    }
}
