//Writing a program using method that prints the prime number between two numbers.
public class MethodExercise2 {
    public static void main(String[] args) {
            printPrimeBetween(100,2000);
    }
    public static boolean prime(int n){
       for(int i=2;i<= n/2;i++)
           if(n%i==0)
               return false;


               return true;

        }
        public static void printPrimeBetween(int a,int b) {
            for (int i = a; i <= b; i++)
                if (prime(i)) {
                    System.out.println(i + " ");
                }

        }
}
