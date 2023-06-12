
class Car{
    private String Model;
    private int Price;
    public void setCarInfo(){
        Model = "Toyota";
        Price = 121212;
    }
    public void showCarInfo(){
        System.out.println("Model: "+Model);
        System.out.println("Price: "+ Price);
    }
}

public class CarDemo {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setCarInfo();
        myCar.showCarInfo();
    }
}
