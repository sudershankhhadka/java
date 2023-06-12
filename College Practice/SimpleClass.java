
class Cars{
    String CarName;
    int Price;
}


public class SimpleClass {
    public static void main(String[] args) {
        Cars myCar = new Cars();
        myCar.CarName="Ford";
        myCar.Price=12123;
        System.out.println("Car Name: "+ myCar.CarName);
        System.out.println("Price: "+ myCar.Price);
    }
}
