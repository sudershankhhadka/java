public class Calculator {

        //constructor
    public Calculator(){

    }
        //method
        public int add (int a, int b){
            return a+b;
        }
        public int subtract (int a,int b){
            return a-b;
        }
        public int multiply(int a,int b){
            return a*b;
        }
        public int divide(int a , int b){
            return a/b;
        }
        public int modulo(int a,int b){
            return a % b;
        }
    public static void main(String[] args) {
            Calculator myCalculator =  new Calculator();
        System.out.println( myCalculator.add(4,5));
        System.out.println(myCalculator.subtract(34,56));
        System.out.println(myCalculator.divide(22,2));
        System.out.println(myCalculator.multiply(23,3));
        System.out.println(myCalculator.modulo(23,3));
    }
}
