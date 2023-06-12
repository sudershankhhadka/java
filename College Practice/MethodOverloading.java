//to demonstrate the concept of how method overloading takes place
class Test{
    public int  add(int a, int b){
        int c = a+b;
        return c;
    }
    public double  add(double a, double b){
        double c = a+b;
        return c;
    }
    public int add(int a , int b, int c){
        return a+b+c;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Test tst = new Test();
        tst.add(123,123);
        tst.add(1212.2,12122.22);
        tst.add(1,2,3);
        System.out.println(  tst.add(123,123));
        System.out.println(tst.add(1212.2,12122.22));
        System.out.println(tst.add(1,2,3));
    }
}
