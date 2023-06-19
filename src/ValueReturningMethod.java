public class ValueReturningMethod {
    public static void main(String[] args) {
        System.out.print("The sum is ");
        System.out.println(sum(2,4) + ".");

    }
    public static  int sum(int a, int b){
        return a + b;
    }
}
